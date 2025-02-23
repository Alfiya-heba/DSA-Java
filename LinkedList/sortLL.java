// //Brute Force

// import java.util.ArrayList;
// import java.util.Collections;

// class Node{
//     int data;
//     Node next;
//     Node(int data1){
//         this.data=data1;
//         this.next=null;
//     }
// };
// public class sortLL {
//     private static Node sortLL(Node head){
//         ArrayList<Integer> arr=new ArrayList<>();
//         Node temp=head;
//         while(temp!=null){
//             arr.add(temp.data);
//             temp=temp.next;
//         }
//         Collections.sort(arr);
//         temp=head;
//         for(int i=0;i<arr.size();i++){
//             temp.data=arr.get(i);
//             temp=temp.next;
//         }
//         return head;
//     }
//     private static void print(Node head){
//         while(head!=null){
//             System.out.print(head.data+" ");
//             head=head.next;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Node head=new Node(2);
//         head.next=new Node(4);
//         head.next.next=new Node(1);
//         head.next.next.next=new Node(5);
//         head.next.next.next.next=new Node(3);
//         head=sortLL(head);
//         print(head);
//     }
    
// }



// Optimal Solution

class Node {
    int data;
    Node next;
    
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class sortLL {
    
    // Function to merge two sorted linked lists
    private static Node mergeSort(Node List1, Node List2) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while (List1 != null && List2 != null) {
            if (List1.data <= List2.data) {
                temp.next = List1;
                List1 = List1.next;
            } else {
                temp.next = List2;
                List2 = List2.next;
            }
            temp = temp.next;  // Move temp forward
        }

        // Attach remaining nodes from non-empty list
        if (List1 != null) {
            temp.next = List1;
        } else {
            temp.next = List2;
        }

        return dummyNode.next;
    }

    // Function to find the middle of a linked list
    private static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = null; // Break the list into two halves
        }

        return slow;
    }

    // Merge Sort implementation for Linked List
    private static Node sortLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = findMiddle(head);
        Node left = head;
        Node right = middle;

        // Recursively sort both halves
        left = sortLL(left);
        right = sortLL(right);

        // Merge sorted halves
        return mergeSort(left, right);
    }

    // Function to print the linked list
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main function to test sorting
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(1);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        head = sortLL(head);
        print(head);
    }
}
