public class missingNumber {
    private static int missingNumberinArray(int arr[],int n){
      
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2=sum2+arr[i];
        }
        int missingNumber=sum-sum2;
        return missingNumber;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        int ans=missingNumberinArray(arr,n);
        System.out.println("missing is: " +ans);
    }
    
}
