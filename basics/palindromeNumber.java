public class palindromeNumber{
    private static boolean checkpalindrome(int n){
        int reverse=0;
        int palindrome=n;
        while(n!=0){
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        if(palindrome==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int number=1221;
        if(checkpalindrome(number)){
            System.out.println(number+ " is a plaindrome number");
        }
        else{
            System.out.println(number+ " is not a palindrome number");
        }
    }
}