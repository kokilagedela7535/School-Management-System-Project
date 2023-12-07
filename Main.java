package com.Controller;

import com.Dao.Student;
import com.Dao.Teacher;
import com.entity.SchoolClass;

public class Main {

	public static void main(String[] args) {
		School school = new School();
		Student student1 = new Student("Payal", 15);
		Student student2 = new Student("Riya", 16);
		Student student3 = new Student("Priti", 16);
		Student student4 = new Student("Puja", 15);

		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);

		Teacher teacher1 = new Teacher("Pooja", "Math");
		Teacher teacher2 = new Teacher("Priti", "English");
		Teacher teacher3 = new Teacher("Anjali", "Science");

		school.setTeacher(teacher1);
		school.setTeacher(teacher2);
		school.setTeacher(teacher3);

		SchoolClass mathClass = new SchoolClass("Mathematics", teacher1);
		mathClass.addStudent(student1);
		mathClass.addStudent(student2);
		mathClass.addStudent(student3);
		mathClass.addStudent(student4);

		SchoolClass englishClass = new SchoolClass("English", teacher2);
		englishClass.addStudent(student1);
		englishClass.addStudent(student2);
		englishClass.addStudent(student3);

		SchoolClass scienceClass = new SchoolClass("Science", teacher3);
		scienceClass.addStudent(student1);
		scienceClass.addStudent(student2);
		scienceClass.addStudent(student3);
		scienceClass.addStudent(student4);

		school.addClass(mathClass);
		school.addClass(englishClass);
		school.addClass(scienceClass);

		System.out.println("School information:");
		System.out.println("Number of students: " + school.getStudents().size());
		System.out.println("Number of teachers: " + school.getTeacher().size());
		System.out.println("Number of classes: " + school.getClass().size());
		System.out.println();

		System.out.println("Math class information:");
		System.out.println("Class name: " + mathClass.getClassName());
		System.out.println("Teacher: " + mathClass.getTeacher().getName());
		System.out.println("Number of students: " + mathClass.getStudents().size());
		System.out.println();

		System.out.println("English class information:");
		System.out.println("Class name: " + englishClass.getClassName());
		System.out.println("Teacher: " + englishClass.getTeacher().getName());
		System.out.println("Number of students: " + englishClass.getStudents().size());
		System.out.println();

		System.out.println("Science class information:");
		System.out.println("Class name: " + scienceClass.getClassName());
		System.out.println("Teacher: " + scienceClass.getTeacher().getName());
		System.out.println("Number of students: " + scienceClass.getStudents().size());
		System.out.println();

		school.removeStudent(student1);
		school.removeTeacher(teacher2);
		school.removeClass(mathClass);

		System.out.println("School information after removing one student, teacher and Class:");
		System.out.println("Number of students: " + school.getStudents().size());
		System.out.println("Number of teachers: " + school.getTeacher().size());
		System.out.println("Number of classes: " + school.getClass().size());
	}
}
