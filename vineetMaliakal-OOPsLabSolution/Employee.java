package vin;

import java.util.*;


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String firstName,lastName,dept;
			int ch;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("First name : ");
			firstName = sc.nextLine();
			System.out.print("Last name : ");
			lastName = sc.nextLine();
			
			System.out.print("Please enter the department from the following"
					+ "\n1. Technical"
					+ "\n2. Admin"
					+ "\n3. Human Resource"
					+ "\n4. Legal\n");

			ch = Integer.parseInt(sc.nextLine());
			switch(ch) {
			case 1:
				dept = "tech";
				break;
			case 2:
				dept = "adm";
				break;
			case 3:
				dept = "hr";
				break;
			case 4:
				dept = "lgl";
				break;
			default:
				dept = "ab";
				break;
			}
			
			System.out.println(CredentialService.genEmail(firstName, lastName, dept));
			System.out.println(CredentialService.genPass());
			
			
	}

}
