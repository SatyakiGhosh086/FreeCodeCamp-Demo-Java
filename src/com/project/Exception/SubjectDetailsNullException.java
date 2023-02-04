package com.project.Exception;

import java.util.List;
import java.util.Set;


public class SubjectDetailsNullException extends Exception 
{
	private List<Set<String>> missedProperties;

	public SubjectDetailsNullException(List<Set<String>> missedProperties) {
		super();
		this.missedProperties = missedProperties;
	}

	public List<Set<String>> getMissedProperties() {
		return missedProperties;
	}

	public void setMissedProperties(List<Set<String>> missedProperties) {
		this.missedProperties = missedProperties;
	}
	
	public String getMessage()
	{
		return "The Subject details for the student is missing "+missedProperties.toString();
	}
}
