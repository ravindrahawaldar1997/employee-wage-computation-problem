package com.bridgelabz.employeewagebuilder;

public class UsingClassAndVariable {
		public static final int FULL_TIME=1;
		public static int EMPLOYEE_HOURS=0;
		public static final int EMPLOYEE_RATE_PER_HOUR=20;
		public static final int PART_TIME=2;
		public static final int NUMBER_OF_WORKING_DAYS=20;
		void refactorcode() {
			int TOTAL_EMPLOYEE_HOUR=0;
			int TOTAL_WORKING_DAYS=0;
			int MAXIMUM_HOURS_IN_MONTH=100;
			while(TOTAL_EMPLOYEE_HOUR<= MAXIMUM_HOURS_IN_MONTH &&
					TOTAL_WORKING_DAYS<NUMBER_OF_WORKING_DAYS) {
				TOTAL_WORKING_DAYS++;
				int employeeCheck=(int)Math.floor(Math.random() *10) %3;
				 switch(employeeCheck) {
				 case FULL_TIME :
					 EMPLOYEE_HOURS=16;
					 break;
				 case PART_TIME :
					 EMPLOYEE_HOURS=8;
					 break;
					 default:
						 EMPLOYEE_HOURS=0;
					  }
				 TOTAL_EMPLOYEE_HOUR += EMPLOYEE_HOURS;
				 System.out.println("Day#: " + TOTAL_WORKING_DAYS + " EmpHour: " +EMPLOYEE_HOURS);
			}
			int totalEmployeeWage= TOTAL_EMPLOYEE_HOUR * EMPLOYEE_RATE_PER_HOUR;
			System.out.println("Total Employee Wage " +totalEmployeeWage);	
			}
		public static void main(String[] args) {
			UsingClassAndVariable wage =new UsingClassAndVariable();
			wage.refactorcode();
	}

}
