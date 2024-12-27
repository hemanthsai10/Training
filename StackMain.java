import java.util.*;
class Stack {
    public int[] stack;
    public int top;
    public int size;

    public Stack(int size) {
        stack = new int[size];
        this.size = size;
        this.top = -1;
    }
    public void Push(int data){
        if(top==size-1){
            System.out.println("Stack is Full \n");
        }
        else{
        stack[++top]=data;
        System.out.println(data+" inserted \n");
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack id empty\n");
        }
        else{
            top--;
            System.out.println("Value deleted\n");
        }
    }
    public void peek(){
        if(top==-1){
            System.out.println("Stack is Empty\n");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    public void isEmpty(){
        if(top==-1){
            System.out.println("Stack is Empty\n");
        }
        else{
            System.out.println("Stack is not Empty\n");
        }
    }
    public void stackprint(){
        int temp=top;
        for(int i=0;i<=temp;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println("\n ");
    }
    public void rstackprint(){
        int temp=top;
        for(int i=temp;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println("\n");
    }
}
class StackMain{
    public static void main(String[] args) {
        Scanner th=new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size=th.nextInt();
        Stack s=new Stack(size);
        do{
            System.out.println("1. Inserting an element into a stack. \n2. Deleting an element from the stack. \n3. Get the peek element from the stack. \n4. Check whether the stack is empty or not. \n5. Print the stack. \n6. Print the stack in reverse order \n7. Exit");
            int choice=th.nextInt();
            if(choice==1){
                System.out.println("Enter the element to insert into stack: ");
                int val=th.nextInt();
                s.Push(val);
            }
            else if(choice==2){
                s.pop();
            }
            else if(choice==3){
                s.peek();
            }
            else if(choice==4){
                s.isEmpty();
            }
            else if(choice==5){
                s.stackprint();
            }
            else if(choice==6){
                s.rstackprint();
            }
            else if(choice==7){
                break;
            }
            else{
                System.out.println("Enter the correct option!");
            }
        }while(true);
        System.out.println("Stack Program is successfull");
        th.close();
    }
}