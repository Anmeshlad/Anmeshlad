package StringDemos;

//Q. Write a program to compare a given string to the specified character sequence.

public class Demo6 {

	public static void main(String[] args) {
		String str1="hellow world";
		String str2="hellow world";
		
//      compares the two strings using the equals() method. 
//		The equals() method returns true if the two strings are equal, and false otherwise. 
//		In this case, the two strings are not equal, so the program will print false.
		
		Boolean str3=str1.equals(str2);
		if(str3==true) {
			System.out.println("Both the string are equle.");
		}
		else {
			System.out.println("Both the string are not equle.");
		}
		
//		System.out.println("Difference between two string is : "+str3);

	}

}
