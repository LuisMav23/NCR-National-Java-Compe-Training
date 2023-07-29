
import java.util.Scanner;

public class Practice1{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        var n = 0;
        do{
            n = sc.nextInt();
        }while(n<0 || n>40000);
        String[] names = new String[n];
        for (int i = 0; i < n; i++){
            names[i] = sc.next();
        }
        int[] scores = new int[n];
        for (int i = 0; i < n; i++){
            var charArr = names[i].toLowerCase().toCharArray();
            for (char c : charArr){
                if (contains(vowels, c)) scores[i] += 3;
                else {
                    switch(c){
                        case 't': scores[i] += 3; break;
                        case 'z': scores[i] -= 3; break;
                        case 'p': scores[i] += 1; break;
                        case 'k': scores[i] += 2; break;
                        case 's': scores[i] += 4; break;
                    }
                }
            }
            scores[i] -= (charArr.length * 0.3);
        }
        var oNames = new String[n];
        var oScores = new int[n];
        var largest = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (scores[largest] < scores[j]) largest = j;
                else if (scores[largest] == scores[j]) {
                    if (names[j].compareTo(names[largest]) < 0) largest = j;
                }
            }
            oNames[i] = names[largest];
            oScores[i] = scores[largest];
            names[largest] = "";
            scores[largest] = -100;
        }

        for (int i = 0; i < n; i++){
            System.out.println(oNames[i].toLowerCase()+" :"+oScores[i]);
        }
    }

    private static boolean contains(char[] arr, char c){
        for (char x: arr){
            if (x == c)return true;
        }
        return false;
    }
}
