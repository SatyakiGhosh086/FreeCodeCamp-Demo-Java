package com.project.MainClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.project.Exception.SubjectDetailsNullException;
import com.project.Exception.SubjectListEmptyException;
import com.project.Student.Student;
import com.project.Subject.Subject;

public class MainDriver {

	public static void main(String[] args) 
	{
		Subject sub1 = new Subject(1,"Subject1","SUB1");
		Subject sub2 = new Subject(2,"Subject2","SUB2");
		Subject sub3 = new Subject(3,"Subject3","SUB3");
		
		Student ob1 = new Student();
		ob1.setStudentId(21);
		ob1.setStudentName("Student1");
		ob1.getSubjects().add(sub1);
		
		Student ob2 = new Student();
		ob2.setStudentId(22);
		ob2.setStudentName("Student2");
		ob2.getSubjects().add(sub1);
		ob2.getSubjects().add(sub2);
		
		Student ob3 = new Student();
		ob3.setStudentId(23);
		ob3.setStudentName("Student3");
		ob3.getSubjects().add(sub1);
		ob3.getSubjects().add(sub2);
		ob3.getSubjects().add(sub3);
		
		
		List<Student> students = new ArrayList<Student>();
		students.add(ob1);
		students.add(ob2);
		students.add(ob3);
		
		for(Student s : students)
		{
			System.out.println(s.toString());
			try 
			{
				if(s.getSubjects().isEmpty())
				{
					throw new SubjectListEmptyException(s.toString());
				}
				else
				{
					try
					{
						System.out.println(s.getSubjects().toString());
						List<Set<String>> missedProperties = addMissedSubjectDetails(s.getSubjects());
						if(missedProperties.size() > 0)
						{
							throw new SubjectDetailsNullException(missedProperties);
						}
					}
					catch(SubjectDetailsNullException ex)
					{
						System.out.println(ex.getMessage());
					}
				}
			}
			catch(SubjectListEmptyException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public static List<Set<String>> addMissedSubjectDetails(List<Subject> subjects)
	{
		List<Set<String>> missedProperties = new ArrayList<Set<String>>();
		if(subjects.size() == 1)
		{
			System.out.println("In the check for the single list of subject");
			Subject ob = subjects.get(0);
			int k = 0;
			Set<String> missedDetails = new HashSet<String>();
			if(ob.getSubjectId() == 0)
			{
				k++;
				missedDetails.add("Subject Id is empty");
			}
			if(ob.getSubjectName() == null)
			{
				k++;
				missedDetails.add("Subject name is empty");
			}
			if(ob.getSubjectCode() == null)
			{
				k++;
				missedDetails.add("Subject Code is empty");
			}
			if(k != 0)
			{
				missedProperties.add(missedDetails);
			}	
		}
		else if(subjects.size() > 1)
		{
			System.out.println("In the block which checks more than one subject list");
			Subject ob = subjects.get(0);
			int k = 0;
			Set<String> missedDetails = new HashSet<String>();
			if(ob.getSubjectId() == 0)
			{
				k++;
				missedDetails.add("Subject Id is empty");
			}
			if(ob.getSubjectName() == null)
			{
				k++;
				missedDetails.add("Subject name is empty");
			}
			if(ob.getSubjectCode() == null)
			{
				k++;
				missedDetails.add("Subject Code is empty");
			}
			if(k != 0)
			{
				missedProperties.add(missedDetails);
			}
			for(int i = 1;i < subjects.size();i++)
			{
				k = 0;
				Set<String> missedDetails2 = new HashSet<String>();
				if(ob.getSubjectId() == 0)
				{
					k++;
					missedDetails2.add("Subject Id is empty");
				}
				if(ob.getSubjectCode() == null)
				{
					k++;
					missedDetails2.add("Subject Code is empty");
				}
				if(k != 0)
				{
					missedProperties.add(missedDetails2);
				}	
			}
		}
		return missedProperties;	
	}
}
