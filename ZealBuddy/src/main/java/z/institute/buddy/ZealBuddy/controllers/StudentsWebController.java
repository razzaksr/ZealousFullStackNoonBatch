package z.institute.buddy.ZealBuddy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import z.institute.buddy.ZealBuddy.model.Student;
import z.institute.buddy.ZealBuddy.services.StudentsService;

@Controller
public class StudentsWebController 
{
	@Autowired
	StudentsService service;
	
	@RequestMapping("/")
	public String hai(Model model)
	{		
		return "";
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
		return "new";
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
}