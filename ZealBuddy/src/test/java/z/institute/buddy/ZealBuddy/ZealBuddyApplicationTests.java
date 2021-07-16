package z.institute.buddy.ZealBuddy;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import z.institute.buddy.ZealBuddy.model.Student;
import z.institute.buddy.ZealBuddy.repository.StudentsRepository;
import z.institute.buddy.ZealBuddy.services.StudentsService;

@SpringBootTest
@RunWith(SpringRunner.class)
class ZealBuddyApplicationTests {

	@MockBean
	StudentsRepository repository;
	
	@Autowired
	StudentsService service;
	
	@Test
	public void testEnroll()
	{
		Student student1=new Student(12,"Razak Mohamed S","Salem","Muthayammal",9876545678L,"razzaksr@gmail.com","java full stack",25000,10000,new Date(2021,01,20),new Date(2021,01,20),new Date(2021,01,25),null,true,false);
		Student student2=new Student(45,"Sabarinathan S","Ponnammapet, Salem","Excel",8765678987678L,"sabariragu@gmail.com","java full stack",25000,10000,new Date(2021,01,20),new Date(2021,01,20),new Date(2021,01,25),null,true,false);
		when(repository.save(student1)).thenReturn(student1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Razak Mohamed S", service.insertion(student1).getName());
		assertNotSame(student2, service.insertion(student1));
	}
	
	@Test
	public void testEnroll2()
	{
		Student student1=new Student(12,"Razak Mohamed S","Salem","Muthayammal",9876545678L,"razzaksr@gmail.com","java full stack",25000,10000,new Date(2021,01,20),new Date(2021,01,20),new Date(2021,01,25),null,true,false);
		Student student2=new Student(45,"Sabarinathan S","Ponnammapet, Salem","Excel",8765678987678L,"sabariragu@gmail.com","java full stack",25000,10000,new Date(2021,01,20),new Date(2021,01,20),new Date(2021,01,25),null,true,false);
		when(repository.save(student1)).thenReturn(student1);
		assertNull(service.insertion(student1).getCompleted());
		assertFalse(service.insertion(student1).getDues());
	}

}
