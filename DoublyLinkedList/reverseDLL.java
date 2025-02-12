class Node{
    int data;
    Node next;
    Node prev;

Node(int data1){
    this.data=data1;
    this.next=null;
    this.prev=null;
}
};
public class reverseDLL {
    private static Node reverseDLL(Node head){
        Node temp=head;
        Node previous=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=previous;
            previous=temp;
            temp=front;
        }
        return previous;

    }
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
      
      Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.prev = head;
        head.next.next = new Node(arr[2]);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.prev = head.next.next;
        head = reverseDLL(head);
        print(head);
    }
}
