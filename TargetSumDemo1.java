package ArrayDemos;

import java.util.Scanner;

public class TargetSumDemo1 {
	
	static int SumOfTriplets(int arr[],int target) {
		
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						ans++;
					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter array size : ");
//		int a=sc.nextInt();
//		int[] arr=new int[a];
//		
//		System.out.print("Enter array element : ");
//		for(int i=0;i<a;i++) {
//			arr[i]=sc.nextInt();
//			System.out.println(arr[i]);
//		}
		System.out.print("Given Array : ");
		int arr[]= {1,5,6,7,3,2};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
//		System.out.println(" ");
//		int target=12;
//		System.out.print("Target is : "+target);
		int target=12;
		System.out.println(" ");
		System.out.print("Answer is : "+ SumOfTriplets(arr, target));
		

	}

}
