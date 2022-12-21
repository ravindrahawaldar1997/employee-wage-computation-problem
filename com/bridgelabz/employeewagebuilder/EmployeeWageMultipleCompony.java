package com.bridgelabz.employeewagebuilder;

import java.util.Random;

public class EmployeeWageMultipleCompony {
	static int WAGE_PER_HOUR = 20;
	static int FULL_TIME_HOUR = 8;
	static int PART_TIME_HOUR = 4;

	public static void calculation() {
		int totalWorkingDays = 0;
		int totalHour = 0;
		int totalDailyWage = 0;
		while (totalHour < 100 && totalWorkingDays < 20) {
			int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
			totalWorkingDays++;

			switch (employeeCheck) {
			case 2:
				totalHour = totalHour + FULL_TIME_HOUR;
				totalDailyWage = totalDailyWage + FULL_TIME_HOUR * WAGE_PER_HOUR;
				System.out.println("Employee is present full time: " + totalDailyWage);
				break;
			case 1:
				totalHour = totalHour + PART_TIME_HOUR;
				totalDailyWage = totalDailyWage + PART_TIME_HOUR * WAGE_PER_HOUR;
				System.out.println("Employee is present half time: " + totalDailyWage);
				break;
			default:
				System.out.println("Employee is absent: " + totalDailyWage);

				System.out.println("Working Days is: " + totalWorkingDays + " Hours: " + totalHour);

				System.out.println("Employee total wage for month is: " + totalDailyWage);
			}
		}
	}

	final static int FULL_TIME_WORKER = 1;
	final static int PART_TIME_WORKER = 2;

	public static void calculation(String company, int EMP_RATE_PER_HOUR, int Total_no_Working_Day,
			int EMP_TOTAL_HOURS) {
		int totalworkingdays = 0;
		int empHours = 0;
		int empWage = 0;
		int Totalemphrs = 0;
		System.out.println("Welcome to Employee Wage Builder");

		int Total_emp_wage = 0;
		while (Totalemphrs <= EMP_TOTAL_HOURS && totalworkingdays <= Total_no_Working_Day) {
			totalworkingdays++;
			Random random = new Random();

			int empCheck = random.nextInt(2);

			switch (empCheck) {
			case FULL_TIME_WORKER:
				empHours = 8;

				break;
			case PART_TIME_WORKER:
				empHours = 4;

				break;
			default:
				empHours = 0;
			}
			Totalemphrs = Totalemphrs + empHours;
			empWage = empHours * EMP_RATE_PER_HOUR;
			System.out.println("Daily emp wage is" + empWage);
			Total_emp_wage = empWage + Totalemphrs;
			Total_emp_wage = Total_emp_wage * Total_no_Working_Day;

		}
		System.out.println("The Monthly Wage of Employee of " + company + " is" + Total_emp_wage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		calculation();

		System.out.println("*********************************");
		calculation("Bridgelabzs", 20, 20, 200);
		System.out.println("*********************************");
		calculation("D Mart", 30, 30, 300);
		System.out.println("*********************************");
		calculation("HDFC Bank", 50, 20, 220);
		System.out.println("*********************************");

	}
}
