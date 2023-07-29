
import java.util.Scanner;

public class TGJOHN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number: ");
            String numstr = sc.next();
            if(!numstr.matches("[0-9]+")){
                System.out.println("Invalid Number!");
                continue;
            }
            char[] numarr = numstr.toCharArray();
            int sum = 0;
            for (char c : numarr){
                sum += Character.getNumericValue(c);
            }
            if (Integer.parseInt(numstr) % sum == 0) System.out.printf("%s GREAT JOY\n", numstr);
            else System.out.printf("%s sadness\n", numstr);
        }while(true);
    }
}