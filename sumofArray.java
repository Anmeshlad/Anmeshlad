package ArrayDemos;


public class sumofArray {
	//using static method 
	static void SumOf() {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array is "+ sum);
	}

	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5};
//		int sum=0;
//		for(int i=0;i<5;i++) {
//			sum+=a[i];
//			System.out.println(a[i]);
//		}
//		
//		System.out.println("Sum of Array :- "+sum);
		
		SumOf();

	}

}
