package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment
{
	public AdminDepartment()
	{
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println("\n");
	}
	
	public String departmentName()
	{
		return "Admin Department";
	}
	
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
}
