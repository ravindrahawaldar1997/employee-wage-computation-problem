package com.bridgelabz.employeewagebuilder;

public class EmployeeWageComputation {
	public static final int FULL_TIME=1;
	void checkEmployeeAttendence() {
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if ( employeeCheck == FULL_TIME)
		System.out.println("Employee is Present");
		
		else 
			System.out.println("Employee is Absent");
}

	public static void main(String[] args) {
		EmployeeWageComputation employeewage = new EmployeeWageComputation();
		employeewage.checkEmployeeAttendence();
		}

}
