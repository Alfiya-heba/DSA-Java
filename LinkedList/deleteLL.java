class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class deleteLL{
    private static Node deleteHead(Node head){
        if(head==null)
        return null;
        head=head.next;
        return head;
    }
    private static Node deleteTail(Node head){
        if(head==null || head.next==null)
        return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    private static Node deleteK(Node head,int k){
        //edge case//
        if(head==null)
        return null;
        if(k==1){
            head=head.next;
            return head;
        }
        int cnt=0;
        Node temp=head,prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
            
        }
        return head;

    }
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        //head=deleteHead(head);
        //head=deleteTail(head);
       
        head=deleteK(head, 3);
        print(head);
    }
}