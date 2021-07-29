package z.institute.buddy.ZealBuddy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return repo.findById(id).orElse(new Student());
	}
	
}
