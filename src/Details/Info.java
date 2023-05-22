package Details;

import java.util.Scanner;

public class Info {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Id");
		int empId= s.nextInt();
		s.nextLine();
		System.out.println("Enter Your Name");
		String empName= s.nextLine();
				
		System.out.println("Enter Your emailId");
		String emailId= s.next();
		
		System.out.println("Enter Your PhoneNo");
		long phoneNo= s.nextLong();
		
		System.out.println("Enter Your Salary");
		float salary= s.nextFloat();
		
		System.out.println("Enter Your Gender");
		String Gender= s.next();
		char gen =Gender.charAt(0);
		
		System.out.println("Enter Your City");
		String city= s.next();
		
		System.out.println("Enter Your Id " + empId);
		System.out.println("Enter Your Name " + empName);
		System.out.println("Enter Your emailId " + emailId);
		System.out.println("Enter Your PhoneNo " + phoneNo);
		System.out.println("Enter Your salary " + salary);
		System.out.println("Enter Your Gender " + gen);
		System.out.println("Enter Your City " + city);
		
		
	}
}
