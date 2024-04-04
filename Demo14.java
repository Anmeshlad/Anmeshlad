package StringDemos;

//Q. Write a program to get the last index of a string within a string .

public class Demo14 {

	public static void main(String[] args) {
		String str="abcd";
		for(int i=0;i<=3;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(str.substring(i, j)+" ");
			}
		}
		System.out.println();
		System.out.println("Last index of string within a string is :"+str.lastIndexOf('d'));
	}

}
