class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class LengthofLoop {
    private static int findlength(Node slow,Node fast){
        int cnt=1;
        fast=fast.next;//we can take slow also
        while(fast!=slow){
            cnt++;
            fast=fast.next;
        }
        return cnt;
    }
    private static int LengthofLoopinLL(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return findlength(slow, fast);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
                Node second = new Node(2);
                Node third = new Node(3);
                Node fourth = new Node(4);
                Node fifth = new Node(5);
        
                head.next = second;
                second.next = third;
                third.next = fourth;
                fourth.next = fifth;
                fifth.next = third;
                int length=LengthofLoopinLL(head);
                System.out.println("The Length of the Loop in LinkedList is: " +length);
    }
    
}
