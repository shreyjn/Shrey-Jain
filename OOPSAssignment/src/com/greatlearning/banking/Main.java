package com.greatlearning.banking;

// Driver class to create objects of the classes present in the package and generate the output

public class Main 
{
	public static void main(String args[])
	{
		AdminDepartment admin = new AdminDepartment();
		
		HrDepartment    hr    = new HrDepartment();
		
		TechDepartment tech   = new TechDepartment();	
		
		//Calling methods of AdminDepartment class
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.IsTodayAHoliday());
		
		
		//Calling methods of HrDepartment class
		System.out.println();System.out.println();
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.IsTodayAHoliday());
		
		
		//Calling methods of TechDepartment class
		System.out.println();System.out.println();
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.IsTodayAHoliday());
	
	}
}
