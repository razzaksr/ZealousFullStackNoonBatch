package zealous.erp.ZBuddy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import zealous.erp.ZBuddy.services.StudentsService;

@Controller
public class WebController 
{
	@Autowired
	StudentsService service;
}
