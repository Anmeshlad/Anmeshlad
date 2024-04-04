package ArrayDemos;

//Q. Write a program to put even and odd elements of array in two separate arrays.

public class Demo17 {
	
	public static void main(String[] args) {
		System.out.print("Given Array: ");
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length;i++) {
			  System.out.print(arr[i]+ " ");
			}
		
		System.out.println(" ");
		
	    System.out.print(" Even Array Elements : ");
	    int arr1[]= {};
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]%2==0) {
	    		arr1=arr;	
	    		System.out.print(arr1[i]+" ");
	    		
	    	}
	    }
	    
        System.out.println(" ");
		
	    System.out.print("Odd Array Elements : ");
	    int arr2[]= {};
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]%3==0) {
	    		arr2=arr;	
	    		System.out.print(arr2[i]+" ");
	    	}
	    	
	    }
	    
	}
}

