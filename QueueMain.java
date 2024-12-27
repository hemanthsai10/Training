import java.util.*;
class Queue{
    public int queue[];
    public int front;
    public int rear;
    public int size;
    public Queue(int size) {
        this.size=size;
        queue=new int[size];
        front=-1;
        rear=0;
    }
    public void enqueue(int data){
        if(rear==size){
            System.out.println("Queue is Full");
        }
        else{
            if(front==-1){
                front=0;
            }
            queue[rear++]=data;
            System.out.println(data+" is inserted");
        }
    }
    public void dequeue(){
        if(front==rear-1){
            System.out.println("Queue is empty");
            front=-1;
            rear=0;
        }
        else{
            front++;
            System.out.println("Element deleted");
        }
    }
    public void peek(){
        if(front==rear){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println(queue[rear-1]);
        }
    }
    public void queueprint(){
        int fro=front;
        int re=rear;
        if(fro==re || fro==-1 || re==0){
            System.out.println("Queue is Empty");
        }
        else{
            for(;fro<re;fro++){
                System.out.print(queue[fro]+" ");
            }
            System.out.println();
        }
    }
    public void rqueueprint(){
        int fro=front;
        int re=rear-1;
        if(fro==re+1 || fro==-1 || re==0){
            System.out.println("Queue is Empty");
        }
        else{
            for(;re>=fro;re--){
                System.out.print(queue[re]+" ");
            }
            System.out.println();
        }
    }
}
class QueueMain{
    public static void main(String[] args) {
        Scanner th=new Scanner(System.in);
        System.out.println("Enter the size of queue");
        int size=th.nextInt();
        Queue q=new Queue(size);
        do{
            System.out.println("1. Enter a new element into Queue \n2. Delete an element from the queue \n3. Get Peek Element from the queue \n4. Print Queue \n5. Print Queue in reverse order \n6.Exit");
            int choice=th.nextInt();
            if(choice==1){
                System.out.println("Enter the element: ");
                int val=th.nextInt();
                q.enqueue(val);
            }
            else if(choice==2){
                q.dequeue();
            }
            else if(choice==3){
                q.peek();
            }
            else if(choice==4){
                q.queueprint();
            }
            else if(choice==5){
                q.rqueueprint();
            }
            else if(choice==6){
                break;
            }
            else{
                System.out.println("Enter the correct option!");
            }
        }while(true);
        System.out.println("Queue program is done");
        th.close();
    }
}