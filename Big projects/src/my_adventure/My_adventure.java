package my_adventure;

import java.util.Scanner;

public class My_adventure {

	// In the past, I always found out that there are some math problems are so hard to solve.
	// You say you did not enter such stuffs?
	// What about this?
	// Function y=ax^2+bx+c, find out all the possibilities of the range of y in interval (m,n), m<n.
	// Is that a little confusing for you? 
	// Then let's see how does the computer do this!
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
			System.out.println("enter a,b,c,m,n");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double m = input.nextDouble();
			double n = input.nextDouble();
			double k = -2*a/b;
			double vertex = a*k*k+b*k+c;
			double y1 = a*m*m+b*m+c;
			double y2 = a*n*n+b*n+c;
			
			if (vertex > y1) {
				if(y1>y2) {
					System.out.print("(");
					System.out.print(y2);
					System.out.print(",");
					System.out.print(vertex);
					System.out.println(")");
				}
				else {
					if(vertex < y2) {
					System.out.print("(");
					System.out.print(y1);
					System.out.print(",");
					System.out.print(y2);
					System.out.println(")");
					}
					else {
						System.out.print("(");
						System.out.print(y1);
						System.out.print(",");
						System.out.print(vertex);
						System.out.println(")");
					}
				}
			}
			else {
				if(y2 < vertex) {
					System.out.print("(");
					System.out.print(y2);
					System.out.print(",");
					System.out.print(y1);
					System.out.println(")");
				}
				else {
					if(y2>y1) {
						System.out.print("(");
						System.out.print(vertex);
						System.out.print(",");
						System.out.print(y2);
						System.out.println(")");
					}
					else {
						System.out.print("(");
						System.out.print(vertex);
						System.out.print(",");
						System.out.print(y1);
						System.out.println(")");
					}
					
				}
			}
		//So, there you get the answer, right?
		//You just have to put variables in to it, even if the variables are so strange.
		//What we are going to do next is more interesting.(^_^)
			System.out.println("Press 3 to go to the next question");
			int q = input.nextInt();
			if (q == 3) {
			break;
			}
		}
		System.out.println("So here is the question:");
		System.out.print("Compare the value of the two expressions:");
		System.out.print("(1+(1+...)^0.5)^0.5 , ");
		System.out.println("1+1/(1+1/(1+...)))");
		//!!!!!!!!! YOU CAN SKIP LINE 93 TO LINE 98!
		//Both of the expressions contains infinity amount of root (1+...)/1 over (1+...)
		//We might use some special methods so solve them in real life.
		//like assuming the first expression is M, the second is N
		//Then we find out that M=(1+M)^2, N=1+1/N
		//So we have the equations: M^2-M-1=0; N^2-M-1=0
		//Next, since both M and N is bigger than 0, they all equals to (1+5^0.5)/2
		//So, M = N
		
		// However, some of us may not be able to get the method above.
		// So, there comes our computer!
		
		double M=1;
		double N=1;
		// for(int u = Integer.MAX_VALUE; u < Integer.MAX_VALUE; u++) {  
		//It is supposed to be this one! But I don't want to crack my mac T_T.
			for(int u = 0; u < 500; u++) {
				M= Math.sqrt(M+1);
		}
			for(int u = 0; u < 500; u++) {
				N = 1+1/N;
			}
			System.out.println("here is the answer");
			System.out.println(N-M);
			// This is amazing right?
			// The difference between two numbers is too small, so our computer count it as 0!
		}
		
	}


