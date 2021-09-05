package com.greatlearning.model;

public class SuperDepartment {

	public String l_departmentName = "Super Department";
	public String l_todaysWork = "No Work as of now";
	public String l_workDeadline = "Nil";
	public String l_isHoliday = "Today is not a holiday";
	
	/*SuperDepartment()
	{
		System.out.println(isTodayAHoliday());
		System.out.println("\n");
	}*/
	
	String departmentName()
	{
		return l_departmentName;
	}
	
	String getTodaysWork()
	{
		return l_todaysWork;
	}
	
	String getWorkDeadline()
	{
		return l_workDeadline;
	}
	
	String isTodayAHoliday()
	{
		return l_isHoliday;
	}

}
