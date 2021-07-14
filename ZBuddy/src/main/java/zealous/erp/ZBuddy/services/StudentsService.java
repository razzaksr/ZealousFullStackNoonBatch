package zealous.erp.ZBuddy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zealous.erp.ZBuddy.entity.Student;
import zealous.erp.ZBuddy.repository.StudentsRepository;

@Service
public class StudentsService 
{
	@Autowired
	StudentsRepository repo;
	
	public String insertion(Student object)
	{
		return repo.save(object).getName()+" has Updated";
	}
	
}
