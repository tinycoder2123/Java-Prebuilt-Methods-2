/**********************************************************
 * Module 3
 * Assignment 2
 * By Karolina Szulczyk
 * 
 * This program dissects a phone number and displays country
 * code, area code, and local number.
 *********************************************************/

package Assignments;

import java.util.Scanner;

public class PhoneNumberDissector 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		String phoneNumber;
		String countryCode;
		String areaCode;
			do
				{
					System.out.println("Please enter a phone number in the form cc-area-local, where cc = country code digits, area = area code digits,");
					System.out.println("and local = local phone digits. Or enter q to quit: ");
					phoneNumber = stdIn.nextLine();
		
					if (phoneNumber.charAt(0) != 'q')
						{
						countryCode = (phoneNumber.substring(0,phoneNumber.indexOf('-')));
						int sep = phoneNumber.lastIndexOf("-");
						char dash = phoneNumber.charAt(1);
						System.out.println("Country Code = " + countryCode);
					if (dash == '-')
						{
						areaCode = phoneNumber.substring(2,5);
						System.out.println("Area Code = " + areaCode);
						}
					else
						{
						areaCode = phoneNumber.substring(3,6);
						System.out.println("Area Code = " + areaCode);
						}
						System.out.println("Local Number = " + phoneNumber.substring(sep+1));
						}
					else
						{
						phoneNumber = "q";
						}
					}
			while (phoneNumber != "q");
			System.out.print("Thanks for playing");
	}	
}