public class sorted {
    private static boolean checksort(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        System.out.println(checksort(arr, n));
    }
    
}
