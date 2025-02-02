class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class insertLL {
    private static Node insertTail(Node head,int val){
        if(head==null){
        return new Node(val);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        temp.next=newNode;
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
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head=insertTail(head, 100);
        print(head);
    }

    
    
}
