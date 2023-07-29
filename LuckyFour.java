/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class LuckyFour
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++){
		    var num = String.valueOf(sc.nextInt()).toCharArray();
		    var count = 0;
		    for (int j = 0; j < num.length; j++){
		        if (num[i] == '4') count++;
		    }
		    System.out.println(count);
		}
	}
}
