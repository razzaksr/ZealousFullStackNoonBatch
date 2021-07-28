package z.institute.buddy.ZealBuddy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import z.institute.buddy.ZealBuddy.model.Student;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> 
{
	public List<Student> findAllByCertificate(Boolean certificate);
	
	// HibernateQueryLanguage
	@Query("from Student where name like %:name%")
	public List<Student> findAllByName(String name);
	
	@Query("from Student where course like %:course%")
	public List<Student> findAllByCourse(String course);
}
