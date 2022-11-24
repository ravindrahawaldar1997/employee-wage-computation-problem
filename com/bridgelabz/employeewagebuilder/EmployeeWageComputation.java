package com.bridgelabz.employeewagebuilder;

public class EmployeeWageComputation {
	public static final int FULL_TIME=1;
	public static int EMPLOYEE_HOURS=0;
	public static final int EMPLOYEE_RATE_PER_HOUR=20;
	public static final int PART_TIME=2;
	void checkEmployeeAttendence() {
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if ( employeeCheck == FULL_TIME)
		System.out.println("Employee is Present");
		
		else 
			System.out.println("Employee is Absent");
}
	void employeeDailyWage() {
		int EMPLOYEE_WAGE=0;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if ( employeeCheck == FULL_TIME)
			EMPLOYEE_HOURS=8;
		else
			EMPLOYEE_HOURS=0;
	
		EMPLOYEE_WAGE=EMPLOYEE_HOURS * EMPLOYEE_RATE_PER_HOUR;
		System.out.println("Employee Daily Wage " + EMPLOYEE_WAGE);
	}	
	void partTimeEmployeeWage() {
		int EMPLOYEE_WAGE=0;
		int employeeCheck =(int) Math.floor(Math.random() * 10) % 3;
		if ( employeeCheck == FULL_TIME)
			EMPLOYEE_HOURS=16;
		else if
			( employeeCheck == PART_TIME)
			EMPLOYEE_HOURS=8;
		else
			EMPLOYEE_HOURS=0;
	
		EMPLOYEE_WAGE=EMPLOYEE_HOURS * EMPLOYEE_RATE_PER_HOUR;
		System.out.println("Employee Wage " + EMPLOYEE_WAGE);
	}

	public static void main(String[] args) {
		EmployeeWageComputation employeewage = new EmployeeWageComputation();
		//employeewage.checkEmployeeAttendence();
		//employeewage.employeeDailyWage();
		employeewage.partTimeEmployeeWage();
		}
}
