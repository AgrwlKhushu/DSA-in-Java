import java.lang.*;
//import java.util.*;

class doublyNode{
    int data;
    doublyNode prev;
    doublyNode next;

    doublyNode(int d){
        this.data = d;
        this.prev = null;
        this.next = null;
    }
}

public class doublyLinkedList {
    static doublyNode head = null;
    static doublyNode tail = null;
    static doublyNode temp = null;
    static int size = 0;

    static void insertAtFirst(int d){
        doublyNode new_node = new doublyNode(d);

        if(head == null){
            head = tail = new_node;
        }
        else{
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
        size++;
    }

    static void insertAtLast(int d){
        doublyNode new_node = new doublyNode(d);
        if(tail == null){
            head = tail = new_node;
        }
        else{
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
        size++;
    }

    static void insertAtPos(int d, int pos){
        if(pos < 1 || pos > size + 1){
            System.out.println("Enter a valid position.");
        }

        else if(pos == 1){
            insertAtFirst(d);
        }

        else if(pos == size + 1){
            insertAtLast(d);
        }

        else{
            temp = head;
            for(int i = 0; i < pos - 1; i++){
                temp = temp.next;
            }

            doublyNode new_node = new doublyNode(d);
            new_node.next = temp.next;
            temp.next.prev = new_node;
            new_node.prev = temp;
            temp.next = new_node;
            size++;
        }
    }

    static void print(){
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args){

        insertAtFirst(4);
        insertAtFirst(2);
        insertAtFirst(1);
        insertAtLast(5);
        insertAtLast(6);
        print();
        System.out.println(size);

        insertAtPos(3,3);
        print();
        System.out.println(size);

        insertAtPos(0, 1);
        print();
        System.out.println(size);

        insertAtPos(7, 8);
        print();
        System.out.println(size);
    }
}
