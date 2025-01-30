class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class lengthofLL{
    private static int lengthOfLL(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
            System.out.println();
            cnt++;
        }
        return cnt;
    }
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
    
        int length=lengthOfLL(head);
        System.out.println("The length of the LL is: " +length);
       
    }
}