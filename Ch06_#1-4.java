EXERCISE 1:

a)
Completed on Paper.

b)
Result:
10
5
6
3
4
2

c) 
Yes, this is because the loop requires that n>0.

EXERCISE 2:

import java.util.Scanner;
public class squareRoot {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        double number;
        System.out.println("Input Number to Root:");
        number = in.nextDouble();  
        double x1 = number/2;
        double x2 = (x1+number/x1)/2;
        
        while(Math.abs(x2-x1)>0.00001){
        	x1=x2;
        	x2 = (x2+number/x2)/2;
        }
        System.out.printf("%.2f", x2);
    }
}

EXERCISE 3:

public class Gauss {

	public static void main(String[] args) {
		System.out.println(gauss (2.0, 5));
	}
	public static double gauss (double x, int n) {
		int fact =1;
		int sign = 1;
		double exp = 1.0;
		double term=0;
		double sum = 1.0;
		
		for (int i=1; i<n; i++) {
			fact = i * fact;
			sign = sign *-1;
			exp = exp * x * x;
			
			term=(sign*exp/fact);
			
			//System.out.println(term);
			
			sum+= term;
		}
		return sum;
		
	}
}

EXERCISE 4:

public class abecedarian {

	public static void main(String[] args) {
		System.out.println(isAbecedarian("abc"));
	}
	public static boolean isAbecedarian(String str) {
		str=str.toLowerCase();
		for (int i=0; i < str.length()-1; i++) {
			if (str.charAt(i) > str.charAt(i+1) ) {
				return false;
			} 
			//System.out.println( str.charAt(i) +" "+ str.charAt(i+1) );	
		}
		return true;
	}
}
