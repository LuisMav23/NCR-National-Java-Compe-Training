/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class KitchenTimetable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		var T = sc.nextInt();
		for (int i = 0; i < T; i++){
		    var N = sc.nextInt();
		    var A = new int[N];
		    for (int j = 0; j < N; j++){
		        A[j] = sc.nextInt();
		    }
		    var count = 0;
		    for (int j = 0; j < N; j++){
		        var time = sc.nextInt();
		        if (time <= A[j]) count++;
		    }
		    System.out.println(count);
		}
	}
}

