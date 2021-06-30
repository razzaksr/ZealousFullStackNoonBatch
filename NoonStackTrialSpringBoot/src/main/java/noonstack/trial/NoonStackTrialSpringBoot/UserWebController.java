package noonstack.trial.NoonStackTrialSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import noonstack.trial.NoonStackTrialSpringBoot.modelentity.UserInfo;
import noonstack.trial.NoonStackTrialSpringBoot.services.UserService;

@Controller
public class UserWebController 
{
	@Autowired
	UserService serv;
	
	@RequestMapping(value="/enroll",method=RequestMethod.GET)
	public String hi(Model model)
	{
		UserInfo user=new UserInfo();
		model.addAttribute("msg","Zealous Tech Corp");
		model.addAttribute("obj", user);
		return "enroll";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String adding(Model model,UserInfo obj)
	{
		serv.newRow(obj);
		model.addAttribute("msg", obj.getName()+" has added");
		return "enroll";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String fetch(Model model)
	{
		List<UserInfo> tmp = serv.extractAll();
		model.addAttribute("all",tmp);
		return "index";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String fetchOne(Model model, @PathVariable("id") Integer id)
	{
		model.addAttribute("single", serv.extractOne(id));
		return "showcase";
	}
}
