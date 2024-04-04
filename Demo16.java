package ArrayDemos;

//Q. Write a program to remove the duplicate elements of a given array and return the new length of the array.

public class Demo16 {
	
	static void RemoveDuplicateElements(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=0;
				}
			}
		}
		System.out.print("New length of array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	//	return arr;	
	}
	

	public static void main(String[] args) {
		System.out.print("Given Array : ");
		int arr[]= {1,2,5,2,6,1,7,4,4};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		
		RemoveDuplicateElements(arr);

	}

}
