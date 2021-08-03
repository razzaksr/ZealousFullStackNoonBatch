package z.institute.buddy.ZealBuddy.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import z.institute.buddy.ZealBuddy.model.Student;
import z.institute.buddy.ZealBuddy.repository.StudentsRepository;

@Service
public class StudentsService 
{
	@Autowired
	StudentsRepository repo;
	
	public Student insertion(Student object)
	{
		return repo.save(object);
	}
	
	public List<Student> viewAll()
	{
		return repo.findAll();
	}
	
	public List<Student> viewAllViaCertificate(Boolean certificate)
	{
		return repo.findAllByCertificate(certificate);
	}
	
	public List<Student> viewAllViaName(String name)
	{
		return repo.findAllByName(name);
	}
	
	public List<Student> viewAllViaCourse(String course)
	{
		return repo.findAllByCourse(course);
	}
	
	public Student viewById(Integer id)
	{
		return repo.getById(id);
	}
	
	public String eraseByObject(Student student)
	{
		String stuName=student.getName();
		repo.delete(student);
		return stuName+" has deleted";
	}
	
	public String eraseByKey(Integer key)
	{
		String stuName=viewById(key).getName();
		repo.deleteById(key);
		return stuName+" has deleted";
	}
	
	public String certify(Student student)
	{
		List<Student> tmp=new ArrayList<Student>();
		tmp.add(student);
		File fgen=null;
        String hai="";
		try
		{
			File file = ResourceUtils.getFile("classpath:Blank_A4.jrxml");
	        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
	        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(tmp);
	        Map<String, Object> parameters = new HashMap<>();
	        parameters.put("createdBy", "Riyaz and aravind");
	        parameters.put("createdFor", "Zealous TEch Corp");
	        System.out.println("Received @ report end before writing "+tmp);
	        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
	        fgen=new File(student.getName()+".pdf");
	        JasperExportManager.exportReportToPdfFile(jasperPrint, fgen.getAbsolutePath());
	        hai="Report generated @ "+fgen.getAbsolutePath();
	        System.out.println("Received @ report end after writing "+tmp);
		}
		catch(JRException j)
		{j.printStackTrace();} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hai;
	}
	
}
