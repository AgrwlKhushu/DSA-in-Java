import java.lang.*;
//import java.util.*;
//import java.util.stream.StreamSupport;

class singlyNode{
    int data;
    singlyNode next;
    singlyNode (int d){
        this.data = d;
        this.next = null;
    }
}

public class singlyLinkedList {

    static singlyNode head = null;
    static singlyNode tail = null;
    static singlyNode temp = null;
    static int size = 0;

    static void insertAtFirst(int d){
        singlyNode new_node = new singlyNode(d);

        if (head == null){
            head = tail = new_node;
        }

        else{
            new_node.next = head;
            head = new_node;
        }
        size++;
    }

    static void insertAtLast(int d){
        singlyNode new_node = new singlyNode(d);


        if(tail == null){
            head = tail = new_node;
        }
        else{
            tail.next = new_node;
            tail = new_node;
        }
        size++;
    }

    static void insertAtPos(int d, int pos){
        if(pos < 1 || pos > size + 1){
            System.out.println("Please enter a valid position: ");
        }

        if(pos == 1){
            insertAtFirst(d);
        }

        else if(pos == size + 1){
            insertAtLast(d);
        }

        else{
            temp = head;
            for(int i = 1; i < pos - 1; i++){
                temp = temp.next;
            }

            singlyNode new_node = new singlyNode(d);
            new_node.next = temp.next;
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

    static void deleteAtFirst(){
        head = head.next;
        size--;
    }

    static void deleteAtLast(){
        temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    static void deleteAtPos(int pos){
        if(pos < 1 || pos > size){
            System.out.println("Enter valid position.");
        }

        if(pos == 1){
            deleteAtFirst();
        }

        if(pos == size){
            deleteAtLast();
        }

        else{
            temp = head;

            for(int i = 1; i < pos - 1; i++){
                temp = temp.next;
            }

            temp.next = temp.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
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

        deleteAtFirst();
        print();
        System.out.println(size);

        deleteAtLast();
        print();
        System.out.println(size);

        deleteAtPos(3);
        print();
        System.out.println(size);
    }
}