public class countdigits{
    private static int count(int n){
        if(n<0){
            n=n*-1;
        }
        int cnt=0;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        countdigits c=new countdigits();
        System.out.println(c.count(1234));
    }
}