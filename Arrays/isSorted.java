//Check if the array is Sorted and rotated//
public class isSorted {
    private static boolean checkArr(int arr[]){
        int cnt=0;
        if(arr[0]<arr[arr.length-1]){
            cnt++;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                cnt++;
            }
            if(cnt>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4};
        System.out.println(checkArr(arr));
    }
    
}
