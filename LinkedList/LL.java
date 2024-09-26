package LinkedList;

import java.util.*;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0 ;
    }


    private class Node { // These are private because i don't want anybody to access it directly
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}


