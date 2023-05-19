public class QueueByLinked {

    public class node {
        int item;
        node next;

        public node(int item) {
            this.item = item;
        }
    }
        node front, rear;
    int size = 0;

    //default constructor
    public QueueByLinked(){
        front = rear = null;
    }

    public void enQ(int k){
        node n1 = new node(k);

        if(front == null){
            front = rear = n1;
        }
        else {
            rear.next = n1;
            rear = n1;
        }

    }

    public void deQ(){
        node current = front;
        if( current == null){
            System.out.println("empty");
            System.exit(1);
        }
        while(current != null) {
            System.out.println(current.item + " ");
            current = current.next;
        }
        }

    public boolean remove() {
        node current = front;
        if (front == null) {
            return false;
        }

        while (current.next != null) {
            current = current.next;
            return true;
        }
        return false;
    }

}





/*
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int data) {
        Node temp = new Node(data);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue() {
        if (this.front == null)
            return;

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
    }
}


/*
import java.util.LinkedList;
        import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adding elements to the queue
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Elements in Queue: " + q);

        // Removing elements from the queue
        int removedele = q.remove();
        System.out.println("Removed element: " + removedele);

        System.out.println("Elements in Queue after removal: " + q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("Head of queue: " + head);

        // Rest all methods of collection interface like size and contains can be used with this implementation.
    }
}

 */