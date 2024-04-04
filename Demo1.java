package StringDemos;

import java.util.Scanner;

//Q. Write a program to create strings using new and using literal .

public class Demo1 {

	public static void main(String[] args) {
//      String str="Anmesh";
//      System.out.println(str);
//      
//      String str1 = new String("Lad");
//      System.out.println(str1);
		
		
		
		 Scanner sc= new Scanner(System.in);
//		 String s=sc.next();      //next() method in string class only take first string and ignore the remaing string
		 String s=sc.nextLine();  //nextLine() method in string class it take full String 
		 System.out.println(s);
		 
		 System.out.println();
		 
		 System.out.println("Length of String is : "+ s.length());//length() method is used to find the length of string
		 
		 System.out.println();
		 
//		 char ch=s.charAt(3);       //charAt() method is used to find index value of string
//		 System.out.println("Index value of given String is : "+ ch);
		 System.out.println("Index value of given String is : "+ s.charAt(4));
		 
		 System.out.println();
		 
		 String str="Anmesh";
		 System.out.println(str);
		 int idx=str.indexOf('e');
		 System.out.println("Index number of given string is : "+ idx);

		 
		 

	}

}
