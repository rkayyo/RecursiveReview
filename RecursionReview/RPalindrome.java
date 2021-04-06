
public class RPalindrome
{
     public static void main(String[] args) {
        String word = "racecar";
        if (isPalindrome(word)) System.out.print("true");
        else System.out.print("false");
    }
    
    public static boolean isPalindrome(String word) {
        if (word.length() == 1) return true;
        if (word.substring(0,1).equals(word.substring(word.length()-1))) return isPalindrome(word.substring(1,word.length()-1));
        else return false;
    }
}
