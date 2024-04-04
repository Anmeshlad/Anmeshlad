package ArrayDemos;

import java.util.Arrays;
import java.util.Scanner;

//Q. Write a program sort array elements in ascending order using bubble sort or using sort method.

public class Demo12 {

	static void BubbleSort(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
		  System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int x = sc.nextInt();
		int arr[] = new int[x];

		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
         System.out.println();

		BubbleSort(arr);  //static method
		

	}

}
