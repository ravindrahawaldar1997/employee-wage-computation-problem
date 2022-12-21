package com.bridgelabz.employeewagebuilder;

public class TotalWageForEachCompony {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	String companyName;
	int empWagePerHour;
	int maxWorkingDays;
	int maxWorkingHrs;
	int monthlyEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;

	TotalWageForEachCompony(String companyName, int empWagePerHour, int maxWorkingDays, int maxWorkingHrs) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
	}

	public void calculateEmployeeWage() {

		while (totalWorkingDays < maxWorkingDays && totalEmpHrs < maxWorkingHrs) {
			int empHrs = 0;
			int dailyEmpWage = 0;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				totalWorkingDays++;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				totalWorkingDays++;
			}
			dailyEmpWage = empWagePerHour * empHrs;
			totalEmpHrs += empHrs;
			monthlyEmpWage += dailyEmpWage;
		}
	}

	// @Override
	public String toString() {
		return "Employee Wage for a month in " + companyName + " is " + monthlyEmpWage + "\n" + "Total Working Hrs: "
				+ totalEmpHrs + "\n" + "Total working days: " + totalWorkingDays;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Computation Program for Multiple companies");
		TotalWageForEachCompony company1 = new TotalWageForEachCompony("ICICI", 100, 24, 200);
		TotalWageForEachCompony company2 = new TotalWageForEachCompony("HDFC", 180, 26, 200);
		company1.calculateEmployeeWage();
		System.out.println(company1.toString());
		company2.calculateEmployeeWage();
		System.out.println(company2.toString());

	}

}
