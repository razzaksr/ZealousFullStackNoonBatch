package z.institute.buddy.ZealBuddy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import z.institute.buddy.ZealBuddy.model.Student;
import z.institute.buddy.ZealBuddy.services.StudentsService;

@RestController
@RequestMapping("/api")
public class StudentsWebServiceController 
{
	@Autowired
	StudentsService service;
	
	@GetMapping("/all")
	public List<Student> getAll()
	{
		return service.viewAll();
	}
	
	@PostMapping("/new")
	public String newOne(@RequestBody Student student)
	{
		return service.insertion(student).getName();
	}
	
	@DeleteMapping("/remove")
	public String del(@RequestBody Student student)
	{
		return service.eraseByObject(student);
	}
	
	@DeleteMapping("/remove/{id}")
	public String del(@PathVariable("id") Integer id)
	{
		return service.eraseByKey(id);
	}
	
	@PutMapping("/up")
	public String update(@RequestBody Student student)
	{
		return service.insertion(student).getName();
	}
}
