package com.bridgelab;

import java.util.*;

class Employee {
	int isFullTimePresent;
	int isPartTimePresent;
	int randomCheck;
	int workingHrs;
	int wagePerHr;
	int salary;
	int totalSalary;
	int totalHrs;
	int totalDays;
	final int TOTAL_DAYS = 20;
	final int TOTAL_HRS = 100;

	/**
	 * Checking Employee is present or absent
	 */
	public void checkAttendance() {
		Random random = new Random();
		randomCheck = random.nextInt(3);
		if (randomCheck == isFullTimePresent) {
			System.out.println("Employee is Full Time Present ");
			workingHrs = 8;
		} else if (randomCheck == isPartTimePresent) {
			System.out.println("Employee is Part time Present ");
			workingHrs = 4;
		} else {
			System.out.println("Employee is Absent ");
			workingHrs = 0;
		}
	}

	/**
	 * Calculating daily salary of an employee
	 */
	public int calculatingDailyWage() {
		salary = workingHrs * wagePerHr;
		return salary;
	}

	/**
	 * Calculating employee wage for a month
	 */
	public void calculateWageForMonth() {
		for (int i = 0; i < 20; i++) {
			employeeAttendanceUsingCase();
			totalSalary = totalSalary + salary;
			// return totalSalary;
		}
	}

	/**
	 * In this method we are calculating the employee salary based on condition i.e
	 * total working hours are 100 or total working days are 20
	 */
	public void wagesTillCondition() {
		while (true) {
			checkAttendance();
			calculatingDailyWage();
			totalHrs = totalHrs + workingHrs;
			totalDays = totalDays + 1;
			totalSalary = totalSalary + salary;
			if (totalHrs == 100 || totalDays == 20) {
				System.out.println(totalSalary);
				break;
			}
		}
	}

	/**
	 * Checking employee is full time present or part time present or absent
	 * accordingly calculating the salary of an employee using switch case
	 */
	public void employeeAttendanceUsingCase() {
		switch (randomCheck) {
		case 1:
			checkAttendance();
			calculatingDailyWage();
			break;
		case 2:
			checkAttendance();
			calculatingDailyWage();
			break;
		default:
			checkAttendance();
			calculatingDailyWage();
		}
	}
}

public class EmpWageComputation {
	/**
	 * This is main method and it is the starting point of an execution In this we
	 * are giving welcome message and calling methods for employee attendance and
	 * salary
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee obj = new Employee();
		obj.isFullTimePresent = 1;
		obj.wagePerHr = 20;
		obj.totalSalary = 0;
		obj.wagesTillCondition();
		System.out.println(obj.totalSalary);
		System.out.println(obj.totalHrs);
		System.out.println(obj.totalDays);
	}
}
