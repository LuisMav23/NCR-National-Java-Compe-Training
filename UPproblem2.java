import java.util.Scanner;

public class UPproblem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int nMI = 0;
        int nMN = 0;
        String[] gc = new String[m];
        for (int i = 0; i < m; i++){
            gc[i] = sc.next();
        }
        int T = sc.nextInt();
        for (int i = 0; i < T;i++){
            char[] MI = sc.next().toCharArray();
            char[] MN = sc.next().toCharArray();
            for (String x: gc){
                boolean gcEx = false;
                if(MN[0] != '!'){
                    for (char c: MN){
                        if (x.contains(String.valueOf(c))){
                            nMN++;
                            gcEx = true;
                            break;
                        }
                    }
                }
                if (gcEx) continue;
                if (MI[0] != '!'){
                    for (char c: MI){
                        if (!x.contains(String.valueOf(c))){
                            nMI++;
                            break;
                        }
                    }
                }
            }
            System.out.println((int)(Math.pow(m - nMN, k) - nMI));
            nMI = 0;
            nMN = 0;
        }
    }
}
