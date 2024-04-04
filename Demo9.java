package ArrayDemos;

//Q. Write a program to copy an array by iterating the array.

public class Demo9 {
	
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println("Element of arr1:");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Element of arr2:");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

	}

}
