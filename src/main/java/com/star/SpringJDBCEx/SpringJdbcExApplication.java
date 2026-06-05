package com.star.SpringJDBCEx;

import com.star.SpringJDBCEx.model.Student;
import com.star.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("Navin");
		s.setMarks(78);


		StudentService service = context.getBean(StudentService.class);

		List<Student> students = service.getStudents();
		service.addStudent(s);
		System.out.println(students);


//		System.out.println(s.getName());
//		System.out.println(s.getRollNo());
	}

}
