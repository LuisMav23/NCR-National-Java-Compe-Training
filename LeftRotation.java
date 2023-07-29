
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int rot = sc.nextInt();
        char[] strRotated = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            var rotAmount = i - rot;
            while(rotAmount < str.length()){
                rotAmount += str.length()-1;
            }
            strRotated[rotAmount] = str.charAt(i);
        }
        for (char c : strRotated){
            System.out.print(c);
        }
    }
}
