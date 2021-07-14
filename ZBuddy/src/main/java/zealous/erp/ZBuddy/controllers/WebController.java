package zealous.erp.ZBuddy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zealous.erp.ZBuddy.entity.Student;
import zealous.erp.ZBuddy.services.StudentsService;

@Controller
public class WebController 
{
	@Autowired
	StudentsService service;
	
	@RequestMapping("/")
	public String ins(Model model)
	{
		Student student=new Student();
		model.addAttribute("object", student);
		return "new";
	}
	
	@RequestMapping(value="/adding",method=RequestMethod.POST)
	public String insertings(Model model,Student object)
	{
		String out=service.insertion(object);
		model.addAttribute("msg", out);
		return "new";
	}
}
