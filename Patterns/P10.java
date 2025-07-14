public class P10 {
    static void printPattern(int n){
        for(int i=1;i<=2*n-2;i++){//2*n-1 bcoz suppose n=5 then total rows must be 9 thrn(2*5-1)=9
            int stars=i;
            if(i>n){
                stars=2*n-i;//bcoz if i exceeds n then we have to reverse it 2*5-6=4 
            }
            for(int j=1;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}
