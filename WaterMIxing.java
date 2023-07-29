/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WaterMixing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 0;
		do{
		    T = sc.nextInt();
		}while(T < 1 || T > 2000);
		
		for (int i = 0; i < T; i++){
		    int A,B,X,Y;
		    do {
		        A = sc.nextInt();
		    }while(A < 20 || A > 40);
		    do {
		        B = sc.nextInt();
		    }while(B < 20 || B > 40);
		    do {
		        X = sc.nextInt();
		    }while(X < 0 || X > 20);
		    do {
		        Y = sc.nextInt();
		    }while(Y < 0 || Y > 20);
		    int offset = A-B;
		    if (offset < 0){
		        if (offset + X >= 0) System.out.println("YES");
		        else System.out.println("NO");
		    }
		    else if (offset > 0){
		        if (offset - Y <= 0) System.out.println("YES");
		        else System.out.println("NO");
		    }else{
                System.out.println("YES");
            }
		}
	}
}
