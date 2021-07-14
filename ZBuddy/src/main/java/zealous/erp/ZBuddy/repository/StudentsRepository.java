package zealous.erp.ZBuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zealous.erp.ZBuddy.entity.Student;


@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> 
{
	
}
