package com.triphan.util;

import java.util.Scanner;

/**
 * @version 1.0 2021-12-26
 * @author Tri Phan
 *
 */
public class Console 
{
	private static Scanner sc;
	
	/**
	 * Gets a string from the user input from the console.
	 * @param prompt A string asking the user enter something.
	 * @return An entered string.
	 */
	public static String nextString(String prompt)
	{
		sc = new Scanner(System.in);
		String out;
		while (true)
		{
			System.out.print(prompt);
			out = sc.nextLine();
			if (out.trim().length() == 0)
			{
				System.out.println("\nYour input should not be empty.");
				System.out.println("Please re-enter.");
			}
			else
			{
				return out;
			}
		}
	}
	
	/**
	 * Gets a character from the user input from the console.
	 * @param prompt A string asking the user enter something.
	 * @return An entered character.
	 */
	public static char nextChar(String prompt)
	{
		sc = new Scanner(System.in);
		String s;
		while (true)
		{
			System.out.print(prompt);
			s = sc.nextLine();
			if (s.trim().length() == 0)
			{
				System.out.println("\nYour input should not be empty.");
				System.out.println("Please re-enter.");
			}
			else
			{
				return s.charAt(0);
			}
		}
	}
	
	/**
	 * Gets an integer from the user input from the console.
	 * @param prompt A string asking the user enter something.
	 * @return An entered integer.
	 */
	public static int nextInt(String prompt)
	{
		while (true)
		{
			System.out.print(prompt);
			try
			{
				return Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("\nInvalid integer. Please re-enter.");
			}
		}
	}
	
	/**
	 * Gets a double from the user input from the console.
	 * @param prompt A string asking the user enter something.
	 * @return
	 */
	public static double nextDouble(String prompt)
	{
		while (true)
		{
			System.out.print(prompt);
			try
			{
				return Double.parseDouble(sc.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("\nInvalid double. Please re-enter.");
			}
		}
	}
}
















