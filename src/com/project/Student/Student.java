package com.project.Student;

import java.util.ArrayList;
import java.util.List;

import com.project.Subject.Subject;

public class Student 
{
	private int studentId;
	private String studentName;
	private List<Subject> subjects = new ArrayList<>();
	public Student(int studentId, String studentName, List<Subject> subjects) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.subjects = subjects;
	}
	public Student() {
		super();
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", subjects=" + subjects.toString() + "]";
	}
	
	
}
