EXCERCISE 3:

/**Exercise 3  
Write a method called indexOfMax that takes an array of integers 
and returns the index of the largest element. Can you write this 
method using an enhanced for loop? Why or why not?
*/


public class indexOfMax {
	public static void main (String[] args) {
		int[] a = {6,1,3,5,2,4,7};
		System.out.println(indexOfMax (a));
		
	}
	 public static int indexOfMax (int[] max) {
		 int index = 0;
		 for (int i=1; i<max.length; i++) {
			 if (max[i]>max[index]) {
				 index = i;
			 }
			//System.out.println (index);
		 }
		 
	return index;	 
	 }
	
}
