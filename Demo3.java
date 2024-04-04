package ArrayDemos;

import java.util.Arrays;
//Q. Write a program sort array elements in using selection sort.
import java.util.Scanner;

public class Demo3 {
	static boolean isSorted(int[] arr) {
		boolean check=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) {
			check=false;
			break;
			}
		}
		return check;
	}
	

	public static void main(String[] args) {
//		int[] arr= {66,34,87,99,21,43};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter "+ n + " elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is sorted: "+ isSorted(arr));
        
	}

}
