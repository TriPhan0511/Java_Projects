package com.triphan.test;

import java.util.ArrayList;
import java.util.List;

import com.triphan.payroll.Employee;
import com.triphan.util.Console;

public class Tester 
{
	public static void main(String[] args)
	{
		List<Employee> empList = new ArrayList<>();
		
//		Menu options
		char choice;
		do
		{
			System.out.println("\nWelcome to employee management application!");
			System.out.println("1. Add a new employee.");
			System.out.println("2. Show all of current employees.");
			System.out.println("3. Exit the program.");
			choice = Console.nextChar("\nEnter your choice: ");
			switch (choice)
			{
			case '1':
				addAnEmployee(empList);
				break;
			case '2':
				showEmployees(empList);
				break;
			case '3':
				break;
				default:
					System.out.println("\nWrong choice. Please choose again.");
			}
		} while (choice != '3');
	}
	
	private static void addAnEmployee(List<Employee> emps)
	{
		String tempID = Console.nextString("\nEnter an id: ");
		String tempFirstName = Console.nextString("Enter a first name: ");
		String tempLastName = Console.nextString("Enter a last name: ");
		emps.add(new Employee(tempID, tempFirstName, tempLastName));
	}
	
	private static void showEmployees(List<Employee> emps)
	{
		if (emps.size() == 0)
		{
			System.out.println("\nCurrently there is no employee.");
		}
		else
		{
			for (Employee emp: emps)
			{
				System.out.println("\nID: " + emp.getID());
				System.out.println("First name: " + emp.getFirstName());
				System.out.println("Last name: " + emp.getLastName());
			}
		}
		
	}
}























