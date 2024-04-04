package StringDemos;

//Q. Write a program to test methods of String Builder.

public class Demo8 {

	public static void main(String[] args) {
		StringBuilder strBul=new StringBuilder("hellow");
		strBul.append("World");
		System.out.println(strBul);
		
		strBul.delete(6, 20);
		System.out.println(strBul);

	}

}
