import java.lang.*;

public class stackUsingArray {
    static final int MAX = 100;
    static int top = -1;
    static int[] stack = new int[MAX];

    static void push(int x){
        if(top ==  MAX - 1){
            System.out.println("Stack Overflows: Stack is Full");
        }

        else{
            stack[++top] = x;
        }
    }

    static void pop() {
        if(top == -1){
            System.out.println("Stack Underflows: Stack is empty");
        }
        else{
            top--;
        }
    }

    static int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return stack[top];
        }
    }

    static boolean isEmpty(){
        return top == -1;
    }

    static boolean isFull(){
        return top == MAX - 1;
    }

    public static void main(String[] args){
        System.out.println(isEmpty());
        System.out.println(isFull());

        push(10);
        System.out.println(peek());

        push(20);
        System.out.println(peek());

        push(30);
        System.out.println(peek());

        pop();
        System.out.println(peek());

        System.out.println(isEmpty());
        System.out.println(isFull());
    }
}
