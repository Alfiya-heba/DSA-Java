public class SecondLargest{
    private static int secondLarge(int arr[],int n){
        if(n<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        System.out.println(secondLarge(arr, n));
    }
}