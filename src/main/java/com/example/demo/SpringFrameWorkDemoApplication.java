package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringFrameWorkDemoApplication {

//	private static String configLocation;

	public static void main(String[] args) {
//		SpringApplication.run(SpringFrameWorkDemoApplication.class, args);

//		Doctor doctor = new Doctor();
//		doctor.assist();

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Doctor doctor = context.getBean(Doctor.class);
//		Nurse doctor = context.getBean(Nurse.class);
//		Nurse doctor = (Nurse) context.getBean("nurse");

//		Staff staff = context.getBean(Doctor.class);
//		Staff staff = context.getBean(Nurse.class);

//		Doctor staff = context.getBean(Doctor.class);
//		staff.assist();
//		System.out.println(staff.getQualification());

		/*
		 * Annotation Based
		 */

//		Staff staff = context.getBean(Doctor.class);
//		Staff staff = context.getBean(Nurse.class);
//		staff.assist();

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//		Staff staff = context.getBean(Nurse.class);
//		Staff staff = context.getBean(Doctor.class);
//		staff.assist();

		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
		doctor.setQualification("MBBS");
		System.out.println(doctor);

		Doctor doctor1 = context.getBean(Doctor.class);
		doctor1.assist();
		System.out.println(doctor1);

	}

}
