class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;
    }
   
    Node(int data2){
        this.data=data2;
        this.next=null;
        this.prev=null;
    }
};

public class deleteDLL {
  private static Node deleteHead(Node head){
    if(head==null || head.next==null){
        return null;
    }
    Node prev=head;
    head=head.next;
    head.prev=null;
    prev.next=null;
    return head;
  } 
  private static Node deleteTail(Node head){
    if(head==null || head.next==null){
        return null;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node previous=temp.prev;
    previous.next=null;
    temp.next=null;
    return head;
  }
  private static Node deleteK(Node head,int k){
    Node temp=head;
    int cnt=0;
    while(temp!=null){
      cnt++;
      if(cnt==k){
        break;
      }
      temp=temp.next;
    }
    Node previous=temp.prev;
    Node front=temp.next;
    if(previous==null && front==null){
      return null;
    }
    else if(previous==null){
      deleteHead(head);
      return head;
    }
    else if(front==null){
      deleteTail(head);
      return head;
    }
    else{
      previous.next=front;
      front.prev=previous;
      temp.next=null;
      temp.prev=null;
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
      int arr[]={2,4,6,8};
      Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.prev = head;
        head.next.next = new Node(arr[2]);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.prev = head.next.next;
      //head=deleteHead(head);
     //head=deleteTail(head);
     deleteK(head, 2);
      print(head);
  }
}
