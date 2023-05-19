public class Main {
    public static void main(String[] args) {

        //Queue execution
        QueueByLinked qn = new QueueByLinked();
        qn.enQ(5);
        qn.enQ(10);
        qn.enQ(15);
        qn.deQ();
        System.out.println(qn.remove());
        qn.deQ();

        //stack execution
        StackByLinked sn = new StackByLinked();
        sn.push(5);
        sn.push(10);
        sn.push(15);
        System.out.println(" pop: " + sn.pop());
        System.out.println(" peak: " + sn.peek());
        sn.display();
        sn.remove();
        sn.display();

        System.out.println("#########");

        //linked in execution
        linkedList n1 = new linkedList();
        n1.frontAdd(10);
        n1.frontAdd(20);
        n1.frontAdd(30);
        n1.display();
        n1.remove();
        n1.display();

    }
}