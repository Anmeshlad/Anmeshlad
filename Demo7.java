package ArrayDemos;

//Q. Write a program to test if an array contains a specific value.

public class Demo7 {
	
	static void specificvalue(int[]arr) {
		int k=7;
		int a=-1;
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				System.out.println("specific value present in array : " + arr[i]);
			}else {
				System.out.println("specific value not present in array : " );
			}
			break;
		}
	}
 
	public static void main(String[] args) {
		System.out.println("Orignal Array : ");
		int arr[]= {10,2,9,5,8};
	    
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(" ");
		
		specificvalue(arr);//static method call
	}
}
