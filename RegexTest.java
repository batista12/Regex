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

