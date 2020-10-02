package com.capgemini.helloworld;


import java.util.Scanner;
public class Hello1{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ");
			String lname = sc.next();
			String pattern = "[A-Z]*[a-zA-Z]{3,}$";
			if(lname.matches(pattern))
				System.out.println(lname);
			else return;
		}catch(Exception e){return;}}
}
