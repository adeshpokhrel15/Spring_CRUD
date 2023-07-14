package com.cruddemo.demo;

import com.cruddemo.demo.dao.StudentDAO;
import com.cruddemo.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		//lambda expression
		//executed after the spring beans have been loaded
		return runner-> {
			System.out.println("Hello World");
//			createStudent(studentDAO);

			createMultipleStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO){

		// create the student object
		System.out.println("Creating new student objects.....");
		Student tempStudent = new Student(
				"Hello",
				"Buddy",
				"adeshpokhrel15@gmail.com"

		);
		System.out.println(tempStudent);

		// save the student object
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);


		//display id of the saved student
		System.out.println("Saveed student. Generate id:" + tempStudent.getId());

	}
	private void createMultipleStudent(StudentDAO studentDAO){

		// create the student object
		System.out.println("Creating new student objects.....");
		Student tempStudent1 = new Student(
				"Hello",
				"Buddy",
				"adeshpokhrel15@gmail.com"

		);
		Student tempStudent2 = new Student(
				"Buddy",
				"Buddy",
				"adeshpokhrel15@gmail.com"

		);
		Student tempStudent3 = new Student(
				"Buddy",
				"Hello",
				"adeshpokhrel15@gmail.com"

		);
		System.out.println(tempStudent1);
		System.out.println(tempStudent2);
		System.out.println(tempStudent3);

		// save the student object
		System.out.println("Saving the student");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent3);



		//display id of the saved student
		System.out.println("Saveed student. Generate id:" + tempStudent1.getId());
		System.out.println("Saveed student. Generate id:" + tempStudent2.getId());
		System.out.println("Saveed student. Generate id:" + tempStudent3.getId());


	}

}
