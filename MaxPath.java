import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxPath{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        var s = sc.nextInt();
        int[][] T = new int[s][s];
        for (int i = 0; i < s; i++){
            for (int j = 0; j <= i; j++){
                T[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < s; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        List<Integer> list = findMaxPath(T, 0, 0);
        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> findMaxPath(int[][] T, int i, int j){
        List<Integer> left;
        List<Integer> right;
        if (i < T.length - 1){
            left = findMaxPath(T, i + 1, j);
            right = findMaxPath(T, i + 1, j + 1);
        }else{
            List<Integer> self = new ArrayList<>();
            self.add(T[i][j]);
            self.add(T[i][j]);
            return self;
        }
        if (T[i][j] + left.get(0) > T[i][j] + right.get(0)){
            left.set(0, T[i][j] + left.get(0));
            left.add(T[i][j]);
            return left;
        }else{
            right.set(0, T[i][j] + right.get(0));
            right.add(T[i][j]);
            return right;
        }
    }
}