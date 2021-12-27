package com.triphan.payroll;

/**
 * Represents an employee.
 * @author Tri Phan
 * @version 1.0 2021-12-26
 *
 */
public class Employee 
{
	private String id;
	private String firstName;
	private String lastName;
	private double salary;
	
	/**
	 * Represents the employee's address.
	 */
	private Address address;

	/**
	 * Creates an employee with the specified id and name.
	 * @param id The employee's id.
	 * @param firstName The employee's first name.
	 * @param lastName The employee's last name.
	 */
	public Employee (String id, String firstName, String lastName)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Creates an employee with the specified id, name and address.
	 * @param id The employee's id.
	 * @param firstName The employee's first name.
	 * @param lastName The employee's last name.
	 * @param address The employee's address.
	 */
	public Employee (String id, String firstName, String lastName, Address address)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	/**
	 * Gets the employee's id.
	 * @return A string representing
	 * 	the employee's id.
	 */
	public String getID()
	{
		return this.id;
	}

	/**
	 * Gets the employee's first name.
	 * @return A string representing 
	 * 	the employee's first name.
	 */
	public String getFirstName()
	{
		return this.firstName;
	}
	
	/**
	 * Gets the employee's last name.
	 * @return A string representing
	 * 	the employee's last name.
	 */
	public String getLastName()
	{
		return this.lastName;
	}
	
	/**
	 * Gets the employee's salary.
	 * @return A double representing
	 *  the employee's salary.
	 */
	public double getSalary()
	{
		return this.salary;
	}
	
	/**
	 * Sets the employee's salary.
	 * @param salary A double containing
	 *  the employee's salary.
	 */
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	/**
	 * Gets the employeee's address.
	 * @return An Address object representing 
	 * 	the employee's address
	 */
	public Address getAddress()
	{
		return this.address;
	}
}























