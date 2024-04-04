package StringDemos;

//Q. Write a program to create a new String object with the contents of a character array 
//& convert string array to character.

public class Demo7 {

	public static void main(String[] args) {
		char ch[]= {'A','n','m','e','s','h','l','a','d'};
		String str=new String(ch);
		System.out.println("convert character to String Array : "+str);
		
		String str1="Anmeshlad";
		char ch2[]=str1.toCharArray();
		System.out.println("convert String array to characters : ");
		
		for(char c : ch2) {
			System.out.println(c);
		}	
	}
}
