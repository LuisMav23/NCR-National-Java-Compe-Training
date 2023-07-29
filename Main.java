
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter number of elements: ");
            n = sc.nextInt();
        } while (n < 0);
        var arr = new int[n];
        int e;
        for (int i = 0; i < arr.length; i++){
            do {
                System.out.print("Element #"+(i+1)+": ");
                e = sc.nextInt();
            } while (e >= 0 && e <= 2147483647);
            arr[i] = e;
        }
        var odd = new int[n];
        var ino = 0;
        var inp = 1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                System.out.println("Element #"+inp+": "+arr[i]);
            }else{
                odd[ino] = arr[i];
                ino++;
            }
        }
        for (int i = 0; i <= ino; i++){
            System.out.println("Element #"+inp+": "+odd[i]);
        }
    }
}
























