package noonstack.trial.NoonStackTrialSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import noonstack.trial.NoonStackTrialSpringBoot.modelentity.UserInfo;
import noonstack.trial.NoonStackTrialSpringBoot.services.UserService;

@Controller
public class UserWebController 
{
	@Autowired
	UserService serv;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
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
}
