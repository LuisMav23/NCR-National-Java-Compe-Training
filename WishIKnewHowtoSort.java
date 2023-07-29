
import java.util.Random;
import java.util.Scanner;

public class WishIKnewHowtoSort {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        var test = sc.nextInt();
        for (int i = 0; i < test; i++){
            var bitArr = new int[sc.nextInt()];
            var bitIn = -1;
            for (int j = 0; j < bitArr.length; j++){
                do {
                    bitIn = sc.nextInt();
                } while (!(bitIn == 1 || bitIn == 0));
                bitArr[j] = bitIn;
            }
            var isSorted = false;
            var iteration = 0;
            while(!isSorted){
                iteration++;
                int m = (int) (Math.random() * bitArr.length - 1);
                int n = (int) (Math.random() * ((bitArr.length - 1) - (m+1) + 1) + (m+1));
                if (bitArr[m] > bitArr[n]){
                    var temp = bitArr[m];
                    bitArr[m] = bitArr[n];
                    bitArr[n] = temp;
                }
                isSorted = true;
                for (int s = 1; s < bitArr.length; s++){
                    if (bitArr[s] < bitArr[s-1]){
                        isSorted = false;
                        break;
                    }
                }
            }

            System.out.println(iteration);

            for (int x = 0; x < bitArr.length; x++){
                System.out.print(bitArr[x] + " ");
            }
        }
    }
}
