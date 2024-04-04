package StringDemos;

import java.util.Scanner;

//Q. Write a program to compare two strings lexicographically, ignoring case differences.

public class Demo4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		int str3=str1.compareToIgnoreCase(str2);
		
//		System.out.println(str1.compareToIgnoreCase(str2));
		
		if(str3==0) {
			System.out.println("Both the strings are equle.");
		}
		else{
			System.out.println("Both the strings are not equle.");
		}
		
//		String str1="anmesh";
//		String str2="Anmesh";
//		System.out.println(str1.compareToIgnoreCase(str2));

	}

}
