package ArrayDemos;

//Q. Write a program to merge two arrays into third array.

public class Demo25 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		System.out.print("First array : ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
		
		System.out.println(" ");
		
		System.out.print("Second array : ");
		int arr2[]= {4,5,6};
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+", ");
		}
		
		
		int a1= arr1.length;
		int a2=arr2.length;
		
		int a3=a1+a2;
		
		int arr3[]= new int[a3];
		System.out.println(" ");
		for(int i=0;i<a1;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<a2;i++) {
			arr3[a1 + i]=arr2[i];
		}
		System.out.println(" ");
		System.out.println("Third array with combination of Array1 and Array2 : ");
		for(int i=0;i<a3;i++) {
			System.out.print(arr3[i]+",");
		}
	}

}
