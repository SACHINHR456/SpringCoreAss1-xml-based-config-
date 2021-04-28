package com.tyss.SpringCore.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {
	
	public Student()
	{
		
	}
	private int id;
	private String name;
	private Teacher teacher;
	
	

}
