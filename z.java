
import java.util.Scanner;

public class z {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n%2==0) n++;
        for (int z = 0; z < n; z++){
            System.out.print("z");
        }
        System.out.println();
        for (int z = n-1; z > 1;z--){
            for (int k = 0; k < z-1; k++){
                System.out.print(" ");
            }
            System.out.print("z");
            System.out.println();
        }
        for (int z = 0; z < n; z++){
            System.out.print("z");
        }
    }
}
