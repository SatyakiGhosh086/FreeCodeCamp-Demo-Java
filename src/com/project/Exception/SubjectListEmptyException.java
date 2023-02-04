package com.project.Exception;

public class SubjectListEmptyException extends Exception
{
	private String value;

	public SubjectListEmptyException(String value) {
		super();
		this.value = value;
	}
	

	public String getMessage()
	{
		return "The List of subjects is empty for the student with details "+value;
	}
}
