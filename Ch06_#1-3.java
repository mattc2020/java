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
        double x0=6.0;
        double x1 = number/2;
        double x2 = (x1+number/x1)/2;
      	if(x2%1 == 0) {
			System.out.println(x2);

		} else {
			for (int i = 0; i < 1000; i++) {
		     x2 = (x2+number/x2)/2;
			}
		}


    }
}