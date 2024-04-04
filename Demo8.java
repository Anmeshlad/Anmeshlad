package ArrayDemos;

//Q. Write a program to remove a specific element from an array.

public class Demo8 {
//	
//	static void removeElement(int[]arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			arr[3]=0;
//		}
//	}

	public static void main(String[] args) {
		Demo8 d=new Demo8();
		System.out.print("Given Array : ");
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			arr[3]=0;
		}
		
//	    d.removeElement(arr);
		

	}

}
