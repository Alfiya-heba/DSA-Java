// Brute force//

// import java.util.HashMap;
// import java.util.Map;

// class Node{
//     int data;
//     Node next;
//     Node(int data1){
//         this.data=data1;
//         this.next=null;
//     }
// };
// public class detectLoop {
//     private static boolean detectLoop(Node head){
//         Node temp=head;
//         Map<Node, Integer> nodeMap = new HashMap<>();
//         while(temp!=null){
//             if(nodeMap.containsKey(temp)){
//                 return true;
//             }
//             nodeMap.put(temp,1);
//             temp=temp.next;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);
//         Node fourth = new Node(4);
//         Node fifth = new Node(5);

//         head.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;
//         fifth.next = third;
//         if (detectLoop(head)) {
//             System.out.println("Loop detected in the linked list.");
//         } else {
//             System.out.println("No loop detected in the linked list.");
//         }
//     }
    
// }

//optimal solution -- Tortise and hare//

class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class detectLoop{
    private static boolean hasLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        if(hasLoop(head)){
            System.out.println("Has Loop");
        }
        else{
            System.out.println("No loops found!!!");
        }
    }
}
