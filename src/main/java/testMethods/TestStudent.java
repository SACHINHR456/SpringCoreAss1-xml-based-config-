package testMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.SpringCore.Bean.Student;

public class TestStudent {

	public static void main(String[] args) 
	
	{
      ApplicationContext context= new ClassPathXmlApplicationContext("student.xml");
      
         Student student=(Student) context.getBean("stu"); 
         System.out.println(student.getId());
         System.out.println(student.getName());
         System.out.println(student.getTeacher().getTeacherId());
         System.out.println(student.getTeacher().getTeaherName());
        
       
		
		
	}

}
