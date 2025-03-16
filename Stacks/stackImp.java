
import java.util.*;
public class stackImp {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
    }
}
class stack{
    int size=100;
    int arr[]=new int[size];
    int top=-1;
    void push(int x){
        top=top+1;
        arr[top]=x;
    }
    int pop(){
        int x=arr[top];
        top=top-1;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
}
