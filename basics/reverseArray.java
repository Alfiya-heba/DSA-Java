public class reverseArray{
    private static void printArray(int arr[],int n){
        System.out.println("Reversed Array is:--");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    private static void reverseArr(int arr[],int n){
        int start=0,end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        printArray(arr, n);
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        reverseArr(arr, n);
    }
} 