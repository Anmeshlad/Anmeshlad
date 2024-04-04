package StringDemos;

//Q. Write a program to create a character array containing the contents of a string.

public class Demo18 {

	public static void main(String[] args) {
		String str="anmeshlad";
		char ch[]=str.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}

	}

}
