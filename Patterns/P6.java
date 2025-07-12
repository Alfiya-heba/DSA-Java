public class P6 {
    static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    

    
}
