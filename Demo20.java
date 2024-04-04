package ArrayDemos;

//Q. Write a program to replace 0‟s with 1‟s. e.g array is [0,1,0,1,0,1,0,1,0,1,0,1,0].

public class Demo20 {
	
	static void replace(int[]arr) {
		System.out.println();
		System.out.print("Replace 0's with 1's :");
		for(int i=0;i<arr.length;i++) {
			if(0==0) {
				arr[i]=1;
				System.out.print(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {0,1,0,1,0,1,0,1,0,1,0,1,0};
		System.out.print("Orignal array : ");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
		}
		
		replace(arr);

	}

}
