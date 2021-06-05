package com.bridgelab;
import java.util.*;
class Employee {
	int isFullTimePresent;
	int randomCheck;
	public void checkAttendance() {
		Random  random = new Random();
		randomCheck = random.nextInt(2);
		if(randomCheck == isFullTimePresent) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}
}
public class EmpWageComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee obj = new Employee();
		obj.isFullTimePresent = 1;
		obj.checkAttendance();
	}
}
