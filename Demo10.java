package StringDemos;

//Q. Write a program to compare a given string to the specified string buffer.

public class Demo10 {

	public static void main(String[] args) {
		String str="hellow";
		StringBuffer strBuf=new StringBuffer(str);
		System.out.println(str.equals(strBuf));

	}

}
