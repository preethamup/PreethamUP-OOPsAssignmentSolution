package com.greatlearning.model;

public class TechDepartment extends SuperDepartment
{
	public TechDepartment()
	{
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
		System.out.println("\n");
	}
	
	public String departmentName()
	{
		return "Tech Department";
	}
	
	public String getTodaysWork()
	{
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String getTechStackInformation()
	{
		return "core Java";
	}
}
