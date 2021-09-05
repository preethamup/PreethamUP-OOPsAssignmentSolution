package com.greatlearning.model;

public class HrDepartment extends SuperDepartment
{
	public HrDepartment()
	{
		System.out.println(departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println("\n");
	}
	
	public String departmentName()
	{
		return "Hr Department";
	}
	
	public String getTodaysWork()
	{
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String doActivity()
	{
		return "team Lunch";
	}
}
