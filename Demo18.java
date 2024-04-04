package ArrayDemos;

import java.util.Arrays;

//Q. Write a program to get the difference between the largest and smallest values in an array of integers.

public class Demo18 {
	
	static int[] largetsAndSmallest(int arr[]) {
		Arrays.sort(arr);
		int ans[]= {arr[0], arr.length-1};
		return ans;
	}

	public static void main(String[] args) {
		System.out.print("Given Array : ");
		int arr[]= {4,3,2,1,5,6};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	    System.out.println(" ");
	    
	    int ans[]=largetsAndSmallest(arr);
        System.out.println("Largest value in an array is :" + arr[0]);
        System.out.println("Smallest value in an array is : "+ arr.length);
	}

}
