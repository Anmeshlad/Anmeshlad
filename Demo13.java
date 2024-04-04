package ArrayDemos;

//Q. Write a program to find the second largest element in an array.

public class Demo13 {
	
	static void SecondLargetNumber(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
//			if(arr[i]){
//				System.out.println(arr[i]);
//		    }
		}
		System.out.println("Second largets array element is :");
		
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,3,2,1};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		SecondLargetNumber(arr);
	}
}
