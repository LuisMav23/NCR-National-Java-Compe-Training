public class VigenèreCipher {
    public static final char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                                          'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                                          'w', 'x', 'y', 'z'};

    public static void main (String[] args){
        System.out.println(Encrypt("thankyou", "cover")); //outputshould be vvvrbacp
        System.out.println(Dencrypt(Encrypt("thankyou", "cover"), "cover"));
        System.out.println(Encrypt("attackatdawn", "lemon")); //output should be lxfopvefrnhr
        System.out.println(Dencrypt(Encrypt("attackatdawn", "lemon"), "lemon"));

    }

    public static String Encrypt(String message, String key){
        var str = message.toCharArray(); 
    
        var keyIndex = 0;
        var keyArr = new char[str.length];
        var newStr = "";
        for (int i = 0; i < str.length; i++){
            if (keyIndex >= key.toCharArray().length) keyIndex %= key.toCharArray().length;
            keyArr[i] = key.toCharArray()[keyIndex];
            keyIndex++;
        }
        for (int i = 0; i < str.length; i++){
            if (indexInLetters(str[i]) == -1) newStr += " ";
            else newStr += letters[(indexInLetters(keyArr[i]) + indexInLetters(str[i])) % 26];
        }
        return newStr;
    }

    public static String Dencrypt(String message, String key){
        var str = message.toCharArray();
        var keyIndex = 0;
        var keyArr = new char[str.length];
        var newStr = "";
        for (int i = 0; i < str.length; i++){
            if (keyIndex >= key.toCharArray().length) keyIndex %= key.toCharArray().length;
            keyArr[i] = key.toCharArray()[keyIndex];
            keyIndex++;
        }
        for (int i = 0; i < str.length; i++){
            if (indexInLetters(str[i]) == -1) newStr += " ";
            else {
                var newIndex = indexInLetters(str[i]) - indexInLetters(keyArr[i]);
                if (newIndex < 0) newIndex += 26;
                newStr += letters[newIndex];
            }
        }
        return newStr;
    }

    public static int indexInLetters(char c){
        for (int i = 0; i < letters.length; i++){
            if (letters[i] == c) return i;
        }
        return -1;
    }
}
