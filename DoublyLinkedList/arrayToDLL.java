class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;
    }
    Node(int data2){
        this.data=data2;
        this.next=null;
        this.prev=null;
    }
};
public class arrayToDLL{
    private static Node array2DLL(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=array2DLL(arr);
        print(head);
    }
}