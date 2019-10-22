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

public class exponent {

	public static void main(String[] args) {
		gauss(5.0,5.0);
		System.out.println(gauss);
		
	}

	public static void gauss(double x, double n) {
	
		
	}
}
