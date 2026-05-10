package problems;

import java.util.Scanner;

public class SubstringConcat {
	
	public static String substring(String str) {
		if(str.length()==1) {
			return str.charAt(0)+"@";
		}
		else if(str.length()>=2) {
			return ""+str.charAt(0)+str.charAt(1);
		}
		
		return "@@";
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		
		System.out.print(substring(str));
		
	}
}
