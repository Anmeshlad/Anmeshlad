package ArrayDemos;

import java.util.Arrays;

//Q. Write a program to rotate an array to the left.

public class Demo23 {
	
	static int[] reverseArray(int arr[],int a) {
		System.out.print("Reverse array : ");
		
		a = a % arr.length;
		int arr1[]=new int[arr.length];
		int j=0;
		
		for(int i=arr.length-a;i<arr.length;i++) {
		   	arr1[j++]=arr[i];
		}
		
		for(int i=0;i<arr.length-a;i++) {
		   	arr1[j++]=arr[i];
		}
		
		return arr1;
		
         /*--------------------------- Advance approch ------------------------------*/
		
//		int arr1[]=new int[arr.length];
//		int j=0;
//		for(int i=arr.length-1;i>=0;i--) {
//			arr1[j++]=arr[i];
//		}
//		return arr1;
		
		/*---------------------------- Basic approch --------------------------------*/
		
//		int arr1[]= {arr[4],arr[3],arr[2],arr[1],arr[0]};
//		for(int i=0;i<arr1.length;i++) {
//			System.out.print(arr1[i]+" ");
//		}
	}

	public static void main(String[] args) {
		
		System.out.print("Given array : ");
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
        System.out.println();
        
//		int arr1[]=reverseArray(arr);
//		for(int i=0;i<arr1.length;i++) {
//			System.out.print(arr1[i]+" ");
//		}
        
        int a=2;
        int arr1[]=reverseArray(arr,a);
        for(int i=0;i<arr1.length;i++) {
        	System.out.print(arr1+" ");
        }
	}

}
