class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};

public class searchInLL {
    private static int checkIfPresent(Node head,int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int val=7;
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        System.out.println(checkIfPresent(head, val));
    }
    
}
