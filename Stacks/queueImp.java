import java.util.*;

public class queueImp {
    public static void main(String[] args) {
        queue q = new queue();
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}

class queue {
    int size = 100;
    int arr[] = new int[size];
    int start = 0, end = 0, currSize = 0;

    void push(int x) {
        if (currSize == size) {
            System.out.println("Queue is full");
            return;
        }
        arr[end] = x;
        end = (end + 1) % size;
        currSize++;
    }

    int pop() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int x = arr[start];
        start = (start + 1) % size;
        currSize--;
        return x;
    }

    int top() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }

    int size() {
        return currSize;
    }
}
