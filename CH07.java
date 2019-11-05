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

EXCERCISE 5:

public class areFactors {

	public static void main(String[] args) {
		int[] a = {4,6,8,10};
		int n = 2;
		System.out.println(areFactors (a,n));
	}
	



	public static boolean areFactors (int a[], int n) {
		boolean isTrue = true;
		
		for (int i = 0 ; i<a.length; i++) {
		   double number = (double)a[i]/n;
			if((number == (int)number)) {
		    isTrue = true;
		    }
		    else{
		      isTrue = false;
		  	  return isTrue;
		    }
			
		}
	return isTrue;
	}
}
