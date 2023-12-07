package com.entity;

import java.util.ArrayList;

import com.Dao.Student;
import com.Dao.Teacher;

public class SchoolClass {

	private String className;
	private Teacher teacher;
	private ArrayList<Student> students;

	public SchoolClass(String className, Teacher teacher) {
		this.className = className;
		this.teacher = teacher;
		this.students = new ArrayList<Student>();
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}
}
