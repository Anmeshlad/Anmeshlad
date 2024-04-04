package ArrayDemos;

//Q. Write a program to calculate sum and average of array elements

public class Demo1 {

	public static void main(String[] args) {
		int arr1[]= {9,27,36};
		int sum=0;
		int avg=0;
		for(int i=0;i<3;i++) {
		 	 sum=sum+arr1[i];
		 	 avg=sum/arr1[i];
		}
		System.out.println("Sum of array element is "+sum);
		System.out.println("Average of array element is "+avg);
	}

}
