
//     public static void main(String[] args) {
//         for(int i=0;i<4;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// Function approach//
public class P1{
    static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        P1 p=new P1();
        p.printPattern(4); 
    }

}