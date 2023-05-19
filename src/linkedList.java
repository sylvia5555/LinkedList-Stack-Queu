public class linkedList {


    public static class node{
        int item;
        node next;

        public node(int item) {
            this.item = item;
        }
    }

    node head = null, tail = null;

    public void add(int item){
        node n1= new node (item);

        if(head==null)
        {
            head = tail = n1;
            n1.next = null;
        }
        else {
            tail.next=n1;
            tail=n1;
        }
        n1.next=null; // مش لازم نكتبها
    }

    public void display(){
        node temp = head;
        if (head == null)
            System.out.println("empty");
        else
        {
            while(temp != null){
                System.out.println(temp.item);
                temp = temp.next;
            }
        }
    }

    // stack implementation
    public void frontAdd(int item){
        node n2 = new node (item);
        if(head == null)
            head = tail = n2;
        else {
            n2.next = head;
            head = n2;
        }
    }

    public void remove(){
        if( head == null)
            System.out.println("empty");
        else
            head = head.next;
    }

}
