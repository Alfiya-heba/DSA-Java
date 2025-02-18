class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class segrregateLL{
    private static Node segrregateEvenOddLL(Node head){
        if(head==null && head.next==null){
            return head;
        }
        Node odd=head;
        Node even=head.next;
        Node evenhead=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(3);
        head.next.next=new Node(9);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(9);
        head.next.next.next.next.next=new Node(4);
        Node segg=segrregateEvenOddLL(head);
        print(head);


    }
}