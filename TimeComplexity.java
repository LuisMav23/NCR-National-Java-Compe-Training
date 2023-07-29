
import java.util.Scanner;

public class TimeComplexity {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		var T = sc.nextInt();
		for (int i = 0; i < T; i++){
		    var X = sc.nextInt();
		    var Y = sc.nextInt();
		    if (X > Y) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
