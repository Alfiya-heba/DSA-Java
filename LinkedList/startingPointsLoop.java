// //Brute Force Solution//
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
// public class startingPointsLoop {
//     private static Node detectStartingPointLoopLL(Node head){
//         Node temp=head;
//         Map<Node,Integer>nodeMap=new HashMap<>();
//         while(temp!=null){
//             if(nodeMap.containsKey(temp)){
//                 return temp;
//             }
//             nodeMap.put(temp,1);
//             temp=temp.next;
//         }
//         return null;
//     }
//     public static void main(String[] args) {
//         Node head = new Node(1);
//                  Node second = new Node(2);
//                  Node third = new Node(3);
//                  Node fourth = new Node(4);
//                  Node fifth = new Node(5);
        
//                  head.next = second;
//                  second.next = third;
//                  third.next = fourth;
//                  fourth.next = fifth;
//                  fifth.next = third;
//                  Node starting=detectStartingPointLoopLL(head);
//                  if(starting!=null){
//                     System.out.println("The starting Point is :" +starting.data);
//                  }
//                  else{
//                     System.out.println("No loop detected!!!!");
//                  }
//     }
    
// }


//Optimal Solution --Tortise and Hare--
class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class startingPointsLoop{
    private static Node detectStartingPointLoopLL(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
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
                 Node starting=detectStartingPointLoopLL(head);
                 if(starting!=null){
                    System.out.println("The starting Point is :" +starting.data);
                 }
                 else{
                    System.out.println("No loop detected!!!!");
                 }
       
    }
}
