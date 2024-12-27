import java.util.LinkedList;
class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }
    public class linkedlist {
        Node head;
        public void Insert(int data){
            Node n=new Node(data);
            head=n.next;
            //System.out.println(data);
        }
        // public void Delete(){
        //     if(head==null){
        //         System.out.println("No Nodes are present");
        //     }
        //     else{
        //         n.next=null;
        //     }
        // }
        public void rdisplay(){
            for(int i=1;i<n;i--){
                System.out.println(n.data);
        }
    }
}
class Main{
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.Insert(10);
        ll.Insert(220);
        ll.Insert(30);
        ll.Insert(154);
        ll.Insert(321);
        ll.Insert(125);
        //ll.Delete();
        ll.rdisplay();
    }
}

