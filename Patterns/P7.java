public class P7 {
    static void printPattern(int n){
        //outer loop//
        for(int i=0;i<n;i++){
            //inner looop- space first//
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars//
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //Space//
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}
