import java.lang.*;

class stackNode{
    int data;
    stackNode next;

    stackNode(int d){
        this.data = d;
        this.next = null;
    }
}

public class stackUsingLinkedList {
    static stackNode top;
    static stackNode temp;

    static void push(int d){
        stackNode new_node = new stackNode(d);

        if(top == null){
            top = new_node;
        }
        else{
            temp = top;

        }
    }
}
