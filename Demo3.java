package StringDemos;
                                           
//Q. Write a program to compare two strings lexicographically.

//lexicographically means in dictionary order. If two strings are compared based on dictionary position,
//the string that comes afterwards is said to be lexicographically greater.
//It check first letter of both the strings if first string character same as second string character then 
//it checks second character and so on . finally first string character is not match with second string
//but it is greater than second string character string then return positive number otherwise it return negative number. 

public class Demo3 {

	public static void main(String[] args) {
		String str1="anmesh";
		String str2="ganesh";
		
		System.out.println(str1.compareTo(str2));
		

	}

}
