package ArrayDemos;

//Q. Write a program to find and display reverse of an array using third variable.

public class Demo10 {

	public static void main(String[] args) {
		int[] orignalArray = {1, 2, 3, 4, 5};
		System.out.println("Orignal array");
		for(int i=0;i<orignalArray.length;i++) {
			System.out.println( orignalArray[i]);
		}
		
        int length = orignalArray.length;
        
        int[] reversedArray = new int[length];

        // Iterate over the original array in reverse order
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
        	
            reversedArray[j] = orignalArray[i];
            
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < length; i++) {
            System.out.println(reversedArray[i] + " ");
        }
		

	}

}
