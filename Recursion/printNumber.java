//n-1//
public class printNumber{
    private static void printNum(int i,int n){
        if(i<1)
        return;
        System.out.println(i);
        printNum(i-1,n);
    }
    public static void main(String[] args){
        int n=10;
        printNum(n,n);
    }
}