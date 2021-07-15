package z.institute.buddy.ZealBuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import z.institute.buddy.ZealBuddy.model.Student;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> 
{
	
}
