class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class deleteMiddle {
    private static Node deleteMiddleLL(Node head){
        Node slow=head;
        Node fast=head;
        fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next!=null){
            slow.next=slow.next.next;
        }
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
        head.next=new Node(2);
        head.next.next=new Node(3);
        head=deleteMiddleLL(head);
        print(head);
    }
    
}
