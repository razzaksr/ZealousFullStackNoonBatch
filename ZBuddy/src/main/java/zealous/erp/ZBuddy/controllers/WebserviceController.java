package zealous.erp.ZBuddy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import zealous.erp.ZBuddy.services.StudentsService;

@RestController
public class WebserviceController 
{
	@Autowired
	StudentsService service;
}
