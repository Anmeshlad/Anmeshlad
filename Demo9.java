package StringDemos;

//Q. Write a program to test methods of String Buffer.

public class Demo9 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Welcome");
		str.append(" "+"Home..");
		System.out.println(str);
		
		str.delete(0, 5);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		str.replace(0, 5, "X");
		System.out.println(str);
		

	}

}
