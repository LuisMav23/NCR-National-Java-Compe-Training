
import java.util.Scanner;

public class Password {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int t;
        do {
            t = input.nextInt();
        }while(t < 1 || t> 200);

        for(int m = 0; m < t; m++){
            int n;
            do {
                n = input.nextInt();
    
            }while(n < 1 || n > 8);
    
            int in = 0;
            int[] ex = new int[n];
            for (int i = 0; i < n; i++){
                ex[i] = -1;
            }
    
            for (int i = 0; i < ex.length; i++){
                do {
                    in = input.nextInt();
                }while (contains(ex, in) || (in < 0 || in > 9));
                ex[i] = in;
            }

            int[] nex = new int[10 - n];
            int k = 0;
            for (int i = 0; i < 10; i++){
                if (!contains(ex, i)) {
                    nex[k] = i;
                    k++;
                }
            }
    
            String[] r = new String[10000];
            int f = 0;
    
            for (int i = 0; i < k - 2; i++){
                for (int v = i + 1; v < k - 1; v++){
                    r[f] = String.valueOf(nex[i]) + String.valueOf(nex[i]) + String.valueOf(nex[v]) + String.valueOf(nex[v]); // iivv
                    f++;
                    r[f] = String.valueOf(nex[i]) + String.valueOf(nex[v]) + String.valueOf(nex[i]) + String.valueOf(nex[v]); // iviv
                    f++;
                    r[f] = String.valueOf(nex[i]) + String.valueOf(nex[v]) + String.valueOf(nex[v]) + String.valueOf(nex[i]); // ivvi
                    f++;
                    r[f] = String.valueOf(nex[v]) + String.valueOf(nex[v]) + String.valueOf(nex[i]) + String.valueOf(nex[i]); // vvii
                    f++;
                    r[f] = String.valueOf(nex[v]) + String.valueOf(nex[i]) + String.valueOf(nex[v]) + String.valueOf(nex[i]); // vivi
                    f++;
                    r[f] = String.valueOf(nex[v]) + String.valueOf(nex[i]) + String.valueOf(nex[i]) + String.valueOf(nex[v]); // viiv
                    f++;
                }
            }

            int count = 0;
    
            for (int i = 0; i < r.length; i++){
                if (r[i] == null) break;
                count++;
            }

            System.out.println(count);

            for (int i = 0; i < r.length; i++){
                if (r[i] == null) break;
                System.out.print(r[i] + " ");
            }

            
        }
    }

    private static boolean contains(int[] arr, int x){
        for (int i : arr){
            if (i == x) return true;
        }
        return false;
    }
}