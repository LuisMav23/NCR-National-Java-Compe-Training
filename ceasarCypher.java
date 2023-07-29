

public class ceasarCypher {
    public static final char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                                          'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                                          'w', 'x', 'y', 'z'};
    public static void main (String[] args){

        var word = Encrypt("Luis", 3);
        System.out.println(Decrypt(word, 3));
        System.out.println(word);
    }

    public static String Encrypt(String str, int key){
        var arr = str.toCharArray();
        var newStr = "";
        for (char c : arr){
            var index = -1;
            for (int i = 0; i < letters.length; i++){
                if (String.valueOf(letters[i]).equalsIgnoreCase(String.valueOf(c))) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                newStr += " ";
                continue;
            }
            var newIndex = index + key;
            while(newIndex >= 26) newIndex %= 26;
            if (String.valueOf(c).equals(String.valueOf(letters[index])))
            newStr += String.valueOf(letters[newIndex]);
            else
            newStr += String.valueOf(letters[newIndex]).toUpperCase();      
        }
        return newStr;
    }

    public static String Decrypt(String str, int key){
        var arr = str.toCharArray();
        var newStr = "";
        for (char c : arr){
            var index = -1;
            for (int i = 0; i < letters.length; i++){
                if (String.valueOf(letters[i]).equalsIgnoreCase(String.valueOf(c))) {
                    index = i;
                    break;
                }
            } 
            if (index == -1) {
                newStr += " ";
                continue;
            }
            var newIndex = index - key;
            while(newIndex < 0) newIndex += 26;
            if (String.valueOf(c).equals(String.valueOf(letters[index])))
            newStr += String.valueOf(letters[newIndex]);
            else
            newStr += String.valueOf(letters[newIndex]).toUpperCase();
        }
        return newStr;
    }

}
