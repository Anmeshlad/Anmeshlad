package ArrayDemos;

import java.util.Arrays;

//Q. Write a program to perform binary search.

public class Demo2 {
	
//	static void BinarySearch(int arr[]) {
//		int a=45;
//		System.out.print(a + " Found at index "+ Arrays.binarySearch(arr, a));
//	}

	public static void main(String[] args) {
		System.out.print("Given array: ");
		int arr[]= {21,2,45,6,8,7};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		int a=45;
		System.out.print(a + " Found at index "+ Arrays.binarySearch(arr, a));
		
		
//		BinarySearch(arr);
	}
}
