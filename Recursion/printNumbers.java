//1-n//
public class printNumbers{
    private static void printNum(int i,int n){
        if(i>n)
        return;
        System.out.println(i);
        printNum(i+1,n);
    }
    public static void main(String[] args){
        int n=5;
        printNum(1,n);
    }
}