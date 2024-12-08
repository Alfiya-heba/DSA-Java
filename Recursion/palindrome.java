public class palindrome{
    private static boolean checkPalindrome(int i,String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return checkPalindrome(i+1, s);
    }
    public static void main(String[] args) {
        String s="MADAM";
        System.out.println(checkPalindrome(0, s));
    }
}