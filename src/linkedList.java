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
        }
        else {
            tail.next=n1;
            tail=n1;
        }
        n1.next=null;
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

    public void deleteatindex(int index) {
        node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void deleteatend() {
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

    }

    public void addAtIndex(int index, node newnode) {

        node temp = head;
        node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = newnode;
        // temp.next.next=holder;
        newnode.next = holder;
    }

    public  void removeFront(){
        if( head == null)
            System.out.println("empty");
        else
            head = head.next;
    }



    //insert between a and b
    public void insertInBetween(node a, int item){
        node n1 = new node (item);

        if (a.next == null) { //a is the last one (tail)
            a.next=n1;
            a=n1;
        }
        else
            n1.next = a.next;
            a.next = n1;

    }


    public node find(int index)
    {
        node temp= head;
        for(int i=0; i<index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }



}
