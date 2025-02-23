class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class deleteNthfrombehind {
    private static Node deleteNodeFromBehindOfLL(Node head,int n){
        if(head==null){
            return null;
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            Node newHead=head.next;
            head=null;
            return newHead;
        }
        int resu=cnt-n;
        temp=head;
        while(temp!=null){
            resu--;
            if(resu==0){
               
                break;
            }
            temp=temp.next;
        }
            Node deltNode=temp.next;
            temp.next=temp.next.next;
            deltNode=null;
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
        int arr[]={1,2,3,4,5};
        int n=2;
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head=deleteNodeFromBehindOfLL(head,n);
        print(head);
    }
    
}
