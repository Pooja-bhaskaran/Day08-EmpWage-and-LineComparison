package com.Bridgelabz.EmpWage;
//uc7

public class EmployeeWage {

    // class variables
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    static final int NUM_OF_WORKINGDAYS = 20;

    static final int MAX_WORKING_HOURS = 100;
    static int empHours = 0;
    static int totalWorkingHrs = 0;
    static int totalWorkingDays = 0;
    static double empCheck = (int)( Math.floor(Math.random() * 10) % 3 )+1;


    static void calculation() { // => class method
        while (totalWorkingHrs <= MAX_WORKING_HOURS && totalWorkingDays < NUM_OF_WORKINGDAYS) {
            totalWorkingDays++;
            if (empCheck == FULL_TIME_HOUR) {
                System.out.println("Employee is Present and working Full time");
                empHours = 8;
            } else if (empCheck == PART_TIME_HOUR) {
                System.out.println("Employee is Present and working Part time");
                empHours = 4;

            } else System.out.println("Employee is Absent");

        }
        totalWorkingHrs += empHours;
        System.out.println("Day#: " + totalWorkingDays + "EmployeeHours :" + empHours);

        int totalWage = totalWorkingHrs * WAGE_PER_HOUR;
        System.out.println("Employee wage for the month : " + totalWage);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation");
        calculation(); // we called the static method "calculation()" to the main method
    }
}
