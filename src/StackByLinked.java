public class StackByLinked {

    public class node {
        int item;
        node next;
        //constructor
        public node(int item){
            this.item = item;
        }
    }
     node head = null;
     int size = 0;

     public void push(int k){
         node n1 = new node(k);
         if(head == null){
             head = n1;
             n1.next = null;
         }
         else {
             n1.next = head;
             head = n1;
         }
         size++;
     }
     //pop: return top and delete it
     public int pop(){
         if(head == null) {
             System.out.println("empty");
             System.exit(1);
         }

         int item = head.item;
         head = head.next;
         return item;
     }

     //peek: return the top
     public int peek(){
         if(head == null){
             System.out.println("empty");
             System.exit(1);
         }
         return head.item;
     }

     public void display(){

         while(head != null) {
             System.out.println(pop() + " ");
         }
     }

     public void remove(){
         if(head == null){
             System.out.println("empty");
         }
         else {
             node temp = head;
             head = head.next;
             size--;
         }
     }
}