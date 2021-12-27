package com.triphan.payroll;

/**
 * Represents an address.
 * @author Tri Phan
 * @version 1.0 2021-12-26
 *
 */
class Address 
{
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	/**
	 * Creates an address with specified street, city, state and zipcode.
	 * @param street The address' street.
	 * @param city The address' city.
	 * @param state The address' state.
	 * @param zipcode The address' zip code.
	 */
	public Address(String street, String city, String state, String zipcode)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipcode;
	}
	
	/**
	 * Gets the address' street.
	 * @return A string representing
	 * 	the address' street.
	 */
	public String getStreet()
	{
		return this.street;
	}
	
	/**
	 * Gets the address' city.
	 * @return A string representing
	 * 	the address' city.
	 */
	public String getCity()
	{
		return this.city;
	}
	
	/**
	 * Gets the address' state.
	 * @return A string representing
	 * 	the address' state.
	 */
	public String getState()
	{
		return this.state;
	}
	
	/**
	 * Gets the address' zip code.
	 * @return A string representing
	 * 	the address' zip code.
	 */
	public String getZipcode()
	{
		return this.zipCode;
	}
}




























