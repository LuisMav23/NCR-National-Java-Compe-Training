
import java.util.List;

public class Practice2{
    public static void main (String[] args){
        final String[] words = {"execute", "extra", "apple"};
        System.out.print(isWordChain(words));
    }

    public static int isWordChain(String[] words){
        String current;
        int currIn, wordsUsed;
        String[] Used = new String[words.length];
        for (int i = 0; i < words.length; i++){
            current = words[i];
            currIn = i;
            wordsUsed = 1;
            Used[wordsUsed] = words[i];
            for (int j = 0; j< words.length; j++){
                if (wordsUsed == words.length){
                    return words[0].charAt(0) == words[words.length - 1].charAt(words[words.length - 1].length() - 1) ? 2 : 1;
                }
                if ((i == j)||(j == currIn)||contains(Used,words[j])) continue;
                if (current.charAt(current.length()-1) == words[j].charAt(0)){
                    current = words[j];
                    currIn = j;
                    j = -1;
                    Used[wordsUsed] = current;
                    wordsUsed++;
                    continue;
                }
            }
        }
        return -1;
    }

    private static boolean contains(String[] arr, String c){
        for (String x: arr){
            if (x == c)return true;
        }
        return false;
    }
}
