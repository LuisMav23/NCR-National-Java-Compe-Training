import java.util.Scanner;

public class UPproblem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int cFloor = 1;
            int cPass = arr.length;
            int tElapsed = 0;
            while (true){
                for (int x : arr){
                    if (x == cFloor){
                        tElapsed += 3;
                        cPass--;
                    }
                }
                if (cPass <= 0) break;
                tElapsed += 3;
                cFloor++;
            }
            System.out.println(tElapsed);
            System.out.println();
        }
        sc.close();
    }
}
