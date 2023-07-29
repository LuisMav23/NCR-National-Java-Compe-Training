public class LongestCommonSequence{
    public static void main (String[] args){
        
    }

    public String findLongestCommonSequence(String s1, String s2) {
        String ref = s1.length() < s2.length() ? s1: s2;
        String nref = !s1.equals(ref) ? s1: s2;
        for (int i = 0; i < nref.length() - ref.length() + 1; i++){
            if (nref.substring(i, i + ref.length()).equals(ref)) return ref;
        }
        String l = findLongestCommonSequence(ref.substring(0,ref.length() - 1), nref);
        String r = findLongestCommonSequence(ref.substring(1,ref.length()), nref);
        return l.length() > r.length() ? l: r;
    }
}