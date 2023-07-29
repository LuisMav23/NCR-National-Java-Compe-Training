import java.util.Scanner;

public class LongestPalindrome {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        int resLen = 0;

        for (int i = 0; i < str.length(); i++){
            int left = i , right = i;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
                if ((right - left + 1) > resLen){
                    resLen = right - left + 1;
                    result = str.substring(left, right + 1);
                }
                left -= 1;
                right += 1;
            }
            left = i;
            right = i+1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
                if ((right - left + 1) > resLen){
                    resLen = right - left + 1;
                    result = str.substring(left, right + 1);
                }
                left -= 1;
                right += 1;
            }
        }

        System.out.println(result);
        System.out.println(resLen);
    }
}
