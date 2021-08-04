package z.institute.buddy.ZealBuddy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import z.institute.buddy.ZealBuddy.model.Student;
import z.institute.buddy.ZealBuddy.services.StudentsService;


// webpages
@Controller
public class StudentsWebController 
{
	@Autowired
	StudentsService service;
	
	@RequestMapping("/")
	public String hai(Model model)
	{		
		return "index";
	}
	
	@RequestMapping("/ad")
	public String ins(Model model)
	{
		Student student=new Student();
		model.addAttribute("object", student);
		return "new";
	}
	
	@RequestMapping(value="/adding",method=RequestMethod.POST)
	public String insertings(Model model,Student object)
	{
		String out=service.insertion(object).getName()+" has Updated";
		model.addAttribute("msg", out);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		return "home";
	}
	
	@RequestMapping("/list")
	public String list(Model model)
	{
		List<Student> hai=service.viewAll();
		model.addAttribute("all", hai);
		return "list";
	}
	
	@RequestMapping("/find")
	public String find(Model model)
	{
		return "find";
	}
	
	@RequestMapping(value = "/finding",method=RequestMethod.POST)
	public String finding(Model model,@RequestParam(required = false,value="certificate") Boolean certificate,@RequestParam(required = false,value="name") String name,@RequestParam(required = false,value="course") String course)
	{
		System.out.println(certificate+" "+name+" "+course);
		List<Student> object=null;
		if(certificate!=null&&name.equals("")&&course.equals("Select Any Course"))
		{
			System.out.println("Certificated based filter "+certificate);
			object=service.viewAllViaCertificate(certificate);
		}
		else if(certificate==null&&!name.equals("")&&course.equals("Select Any Course"))
		{
			System.out.println("Based on "+name);
			object=service.viewAllViaName(name);
		}
		else if(certificate==null&&name.equals("")&&!course.equals("Select Any Course"))
		{
			course=course.toLowerCase();
			System.out.println("Based on "+course);
			object=service.viewAllViaCourse(course);
		}
		model.addAttribute("all", object);
		return "list";
	}
	
	@RequestMapping("/edit/{obj}")
	public String enableEdit(Model model,@PathVariable("obj") Integer obj)
	{
		Student object=service.viewById(obj);
		model.addAttribute("object", object);
		return "edit";
	}
	
	@RequestMapping("/delete/{no}")
	public String enableDelete(Model model, @PathVariable("no") Integer no)
	{
		model.addAttribute("msg",service.eraseByKey(no));
		return "home";
	}
	
	@RequestMapping("/generate/{num}")
	public String gen(Model model,@PathVariable("num") Integer num )
	{
		Student object=service.viewById(num);
		String h = service.certify(object);
		object.setCertificate(true);
		service.insertion(object);
		model.addAttribute("msg", h);
		return "home";
	}
}