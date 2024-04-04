package ArrayDemos;
import java.util.Scanner;

//Q. Write a program to find the index of an array element

public class Demo6 {
	
	static void IndexOf() {
		int arr[]= {1,2,3,4,5};
		int k=3;
		int ans=-1;//this means given array's value not present in array
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i]) {
				ans=i;
				break;
			}
		}
		System.out.println("Index of given array element is " + ans);
	}

	public static void main(String[] args) {
		Demo6 d=new Demo6();
		d.IndexOf();
	}
}
