/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class atm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		var T = sc.nextInt();
		for (int t = 0; t < T; t++){
		    var K = sc.nextInt();
		    var N = sc.nextInt();
		    for (int i = 0; i < N; i++){
		        var A = sc.nextInt();
		        if(K-A >= 0){
		            K -= A;
		            System.out.print("1");
		        }else{
		            System.out.print("0");
		        }
		    }
		    System.out.println();
		}
	}
}
