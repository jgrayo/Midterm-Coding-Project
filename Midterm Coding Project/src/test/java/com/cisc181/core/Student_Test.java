package com.cisc181.core;

import java.util.ArrayList;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
private static ArrayList<Student> aList;

	@BeforeClass
	public static void setup() throws Exception {
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Section> section = new ArrayList<Section>();
		ArrayList<Semester> semester = new ArrayList<Semester>();
		ArrayList<Student> student = new ArrayList<Student>();
		ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
		
		Course CISC = new Course(UUID.randomUUID(), "CISC 181", 100, eMajor.COMPSI);
		courses.add(CISC);
		
		Course ENGL = new Course(UUID.randomUUID(), "ENGL 101", 100, eMajor.BUSINESS);
		courses.add(ENGL);
		
		Course MATH = new Course(UUID.randomUUID(), "MATH 242", 100, eMajor.ENGINEERING);
		courses.add(MATH);
		
		Semester FALL = new Semester(UUID.randomUUID(),  new GregorianCalendar(2016, 8, 22).getTime(), new GregorianCalendar(2016,12,12).getTime());
		semester.add(FALL);
		
		Semester SPRING = new Semester(UUID.randomUUID(),  new GregorianCalendar(2017, 2, 8).getTime(), new GregorianCalendar(2017,5,20).getTime());
		semester.add(SPRING);		
		
		Section CISC_FALL = new Section(UUID.randomUUID(),UUID.randomUUID());
		section.add(CISC_FALL);
		
		Section CISC_SPRING = new Section(UUID.randomUUID(),UUID.randomUUID());
		section.add(CISC_SPRING);
		
		Section ENGL_FALL = new Section(UUID.randomUUID(),UUID.randomUUID());
		section.add(ENGL_FALL);
		
		Section ENGL_SPRING = new Section(UUID.randomUUID(),UUID.randomUUID());
		section.add(ENGL_SPRING);
		
		Section MATH_FALL = new Section(UUID.randomUUID(),UUID.randomUUID());
		section.add(MATH_FALL);
		
		Section MATH_SPRING = new Section(UUID.randomUUID(),UUID.randomUUID());
		section.add(MATH_SPRING);
		
			aList = new ArrayList<Student>();
			
			aList.add(new Student("Ted","M","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","N","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","O","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","P","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","Q","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","R","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","S","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","T","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","U","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			aList.add(new Student("Ted","V","Carls",new GregorianCalendar(1994, 12, 22).getTime(),"EE","11 South St","(302)221-2222","t@gmail.com"));
			
			

		
}
}