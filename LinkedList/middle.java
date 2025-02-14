// Brute Force solution
// class Node{
//     int data;
//     Node next;
//     Node(int data1){
//         this.data=data1;
//         this.next=null;
//     }
// };
// public class middle {
//     private static Node middleElementLL(Node head){
//         if(head==null || head.next==null){
//             return head;
//         }
//         Node temp=head;
//         int cnt=0;
//         while(temp!=null){
//             cnt++;
//             temp=temp.next;
//         }
//         int mid=(cnt/2)+1;
//         temp=head;
//         while(temp!=null){
//         mid=mid-1;
//         if(mid==0){
//             break;
//         }
//         temp=temp.next;
//     }
//     return temp;
// }
// public static void main(String[] args) {
//     int arr[]={1,2,3,4,5};
//     Node head=new Node(arr[0]);
//     head.next=new Node(arr[1]);
//     head.next.next=new Node(arr[2]);
//     head.next.next.next=new Node(arr[3]);
//     head.next.next.next.next=new Node(arr[4]);
//     Node middle=middleElementLL(head);
//     System.out.println("The middle element of the LinkedList is :" + middle.data);
// }
// }
  


//Optimal Solution//

class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
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
        int arr[]={1,2,3,4,5,6};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head.next.next.next.next.next=new Node(arr[5]);
        Node middle=middleElement(head);
        System.out.println("The middle element of the LinkedList is: " +middle.data);
        
    }
}
