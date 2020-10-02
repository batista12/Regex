package com.capgemini.helloworld;
import java.util.Scanner;
public class UserRegistration{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first name");
			String fname = sc.next();
			String pattern = "[A-Z]*[a-zA-Z]{3,}$";
			if(fname.matches(pattern))
				System.out.println(fname);
			else return;
		}catch(Exception e){return;}}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email
{
	public static void main (String[]args)
	{
		try
		{
			Scanner sc = new Scanner (System.in);
			System.out.println ("Enter the email id");
			String email = sc.next ();
			String pattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			if (email.matches (pattern))
				System.out.println (email);
			else
				return;
		}
		catch (Exception e)
		{
			return;
		}
	}
}
