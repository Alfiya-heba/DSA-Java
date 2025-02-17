
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class PalindromeLL {
    private static boolean isLLPalindrome(Node head){
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=st.peek()){
                return false;
            }
        }
        return true;
    }
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);
        System.out.println("LinkedList:");
        print(head);
        if(isLLPalindrome(head)){
            System.out.println("Is Palindrome!!");
            
        }
        else{
            System.out.println("Noo");
        }

    }
}
