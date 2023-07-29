
import java.util.Scanner;

public class StringPermutation{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++){
            var first = str.charAt(i);
            char[] strArr = new char[str.length()-1];
            int index = 0;
            for (int j = 0; j < str.length(); j++){
                if (i == j) continue;
                else {
                    strArr[index] = str.charAt(j);
                    index++;
                }
            }
            for (int k = 0; k < strArr.length; k++){   
                System.out.print(first);
                for (int n = 0; n < strArr.length;n++){
                    System.out.print(strArr[n]);
                }
                System.out.println();
                var tempArr = new char[strArr.length];
                for (int m = 0; m < strArr.length;m++){
                    if (m == 0) tempArr[m] = strArr[strArr.length-1];
                    else tempArr[m] = strArr[m-1];
                }
                strArr = tempArr;
            }
        }
    }
}