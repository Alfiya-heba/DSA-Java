public class factorial{
    private static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args){
        int n=0;
        int result=fact(n);
        System.out.println("The factorial of " +n+ " is: " +result);
    }
}