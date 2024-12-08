public class armstrong{
    private static boolean checkArmstrong(int n){
        if(n<0){
            n=n*-1;
        }
        int original=n,sum=0;
        while(n!=0){
            int lastdigit=n%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            n=n/10;
        }
        return original==sum;
    }
    public static void main(String[] args){
        // int number=371;
        int number=200;
        if(checkArmstrong(number)){
            System.out.println(number+ " is a armstrong number");
        }
        else{
            System.out.println(number+ " is not a armstrong number");
        }
    }
}