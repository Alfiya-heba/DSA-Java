// public class P3 {
//     public static void main(String[] args) {
//         for(int i=1;i<5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Function based Approach//
public class P3{
    static void printPattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
