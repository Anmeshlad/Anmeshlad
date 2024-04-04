package ArrayDemos;

//Q. Write a program to arrange the elements of an given array of integers where all positive integers appear before all the negative integers.

public class Demo4 {
	
	static void ArrangeElement(int[]arr1) {
		System.out.print("Positive to negitive Array : ");
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>0) {
				System.out.print(arr1[i]+", ");
			}
		}
		
		for(int j=0;j<arr1.length;j++) {
			if(arr1[j]<0) {
				System.out.print(arr1[j]+", ");	
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Orignal Array : ");
		int arr1[]= {-7,-8,1,2,3,4,-5,-6};
			
		for (int i = 0; i < arr1.length; i++) {
	         System.out.print(arr1[i]+", ");	
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
		
        ArrangeElement(arr1);
	}

}
