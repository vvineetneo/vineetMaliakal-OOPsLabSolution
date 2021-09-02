package vin;
import java.util.*;

public class CredentialService {
	public static String genEmail(String firstName,String lastName, String dept){
		return firstName.toLowerCase()+lastName.toLowerCase()+'.'+dept+"@abc.com";
	}
	public static String genPass() {
		String password = "";
		String data="";
		
		Random rand = new Random();
//		33-57,65-122
		for(int i=33; i<58;i++) {
			data += (char)i;
		}
		for(int i=65; i<123;i++) {
			data += (char)i;
		}
		int len = rand.nextInt(5)+6;
		
		for(int i =0;i<len;i++) {
			password += data.charAt(rand.nextInt(data.length())); //0-127,128
		}
		
		return password;	
		
		
	}
}
