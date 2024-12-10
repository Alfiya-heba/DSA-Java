public class linearSearch {
    private static boolean linearsearch(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
       
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=6;
        System.out.println(linearsearch(arr, k));
    }
    
}
