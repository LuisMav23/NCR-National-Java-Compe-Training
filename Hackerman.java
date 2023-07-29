/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hackerman
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++){
		    var A = sc.nextInt();
		    var B = sc.nextInt();
		    var AB = A + B;
		    var bobLose = true;
		    for (int j = 2; j <= AB/2; j++){
		        if (AB%j==0)System.out.println("Bob");
		        else bobLose = true;
		    }
		    if (bobLose)System.out.println("Alice");
		}
	}
}
