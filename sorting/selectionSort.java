public class selectionSort {
    private static void selectionsort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After Selection Sort:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={44,67,12,37,76,69,1};
        int n=7;
        System.out.println("Array before Sorting");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            selectionsort(arr, n);
        }
    }
    
}
