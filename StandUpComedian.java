import java.util.Scanner;;

public class StandUpComedian{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++){
            int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
            int n = a[0];
            int x = 0;
            int s = a[0] < a[3] ? a[0] + 1: a[3];
            // x = ()
            n += s + x;
            System.out.println(n);
        }
    }
}