//Brute force solution//
// class Node{
//     int data;
//     Node next;
//     Node(int data1,Node next1){
//         this.data=data1;
//         this.next=next1;
//     }
//     Node(int data2){
//         this.data=data2;
//         this.next=null;
//     }
// };
// public class middle{
//     private static Node middleElement(Node head){
//         if(head==null || head.next==null){
//             return head;
//         }
//         Node temp=head;
//         int cnt=0;
//         while(temp!=null){
//             cnt++;
//             temp=temp.next;
//         }
//         int mid=cnt/2+1;
//         temp=head;
//         while(temp!=null){
//             mid=mid-1;
//             if(mid==0)
//             break;
//             temp=temp.next;
//         }
//         return temp;
//     }
//     public static void main(String[] args) {
//         Node head=new Node(1);
//         head.next=new Node(2);
//         head.next.next=new Node(3);
//         head.next.next.next=new Node(4);
//         Node mid=middleElement(head);
//         System.out.print("The middle Element is:" + mid.data);
//     }
// }

class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data2){
        this.data=data2;
        this.next=null;
    }
};
public class middle{
    private static Node middleElement(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        Node mid=middleElement(head);
        System.out.println("The middle element is:" +mid.data);
    }
}