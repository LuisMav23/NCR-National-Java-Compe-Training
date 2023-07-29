
import java.util.Scanner;

public class ChessMatch {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		var T = sc.nextInt();
		for (int i = 0; i < T; i++){
		    var N = sc.nextInt();
		    int aCon = 180 + (2*((N+1)/2));
		    int bCon = 180 + (2*(N/2));
		    int aFloor = 0;
		    int bFloor = 0;
		    int A, B;
		    if (N%2==0)bFloor = 2;
		    else aFloor = 2;
		    do {
		        A = sc.nextInt();
		    }while(A < aFloor || A > aCon);
		    do {
		        B = sc.nextInt();
		    }while(B < bFloor || B > bCon);
		    System.out.println((aCon-A)+(bCon-B));
		}
	}
}
