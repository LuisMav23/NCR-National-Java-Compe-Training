import java.util.Scanner;

public class TechnicalSupport {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        var testcases = in.nextInt();
        for (int i = 0; i < testcases; i++ ){
            var dialog = in.nextInt();
            var inputs = new char[dialog];
            var qa = ' ';
            for (int j = 0; j < dialog; j++){
                do{
                    qa = in.next().charAt(0);
                }while(qa != 'Q' || qa != 'A');
                inputs[j] = qa;
            }
            var Qcount = 0;
            var Acount = 0;
            for (int k = 0; k < dialog; k++){
                switch(inputs[k]){
                    case 'Q':Qcount++;
                    case 'A':Acount++;
                }                                                                               
            }
            if (Qcount <= Acount) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
