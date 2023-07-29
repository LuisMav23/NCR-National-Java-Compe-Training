/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NaiveChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		do{
		    T = sc.nextInt();
		}while(T < 1 || T > 70);
		for (int i = 0; i < T; i++){
		    int N, A, B;
		    do {
		        N = sc.nextInt();
		    }while(N < 1 || N > 10000);
		    do{
		        A = sc.nextInt();
		    }while(A < 1|| A > N);
		    do{
		        B = sc.nextInt();
		    }while(B < 1 || B < N);
		    var Aquan = 0;
		    var Bquan = 0;
		    var x = 0;
		    for (int j = 0; j < N; j++){
		        do{
		            x = sc.nextInt();
		        }while(x < 1 || x > N);
		        if (x == A) Aquan++;
		        if (x == B) Bquan++;
		    }
		    System.out.println((Aquan/N)*(Bquan/N));
		}
	}
}

