public class reverseNumber{
    private static int reverse(int n){
        long reverse=0;
        while(n!=0){
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
            if(reverse> Integer.MAX_VALUE || reverse< Integer.MIN_VALUE)
            return 0;
        }
        return (int)reverse;
    }
    public static void main(String[] args){
        reverseNumber r=new reverseNumber();
        System.out.println(r.reverse(12345));
    }
}
