public class P8{
    static void printPattern(int n){
        //outer loop
        for(int i=0;i<n;i++){
            //innner loop for spaces//
            for(int j=0;j<i;j++){//j<i bcoz j should be same as i as on 0th row 0 space, 1st row 1 space//
                System.out.print(" ");
            }
            //inner loop for printinh stars//
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //for printing spaces//
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
    
}