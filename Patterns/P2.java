// public class P2 {
//     public static void main(String[] args) {
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Function based Approach//
public class P2{
    static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // P2 p=new P2();
        // p.printPattern(5);// since we are suing static we dont need to create object
        printPattern(5);
    }
}
