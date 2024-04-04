package ArrayDemos;

//Q. Write a program to find and display reverse of an array without using third variable.

public class Demo11 {
	
	static void reverseArray(int arr[]) {
		System.out.print("Reverse array without using third veriable : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+", ");
		}
	}

	public static void main(String[] args) {
		System.out.print("Given Array :- ");
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		
		reverseArray(arr);

	}

}
