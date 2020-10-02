import java.util.Scanner;
public class UserRegistration{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ");
			String lname = sc.next();
			String pattern = "[A-Z]*[a-zA-Z]{3,}$";
			if(lname.matches(pattern))
				System.out.println(lname);
      

