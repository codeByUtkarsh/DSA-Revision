package Linked_List;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step 1 create a node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode next-> head
        newNode.next = head;

        // head= newNode
        head = newNode;

    }

    public void addLast(int data) {
        // step 1 create a node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    // print
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add into the middle
    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int idx = 0;
        while (idx < index - 1) {
            temp = temp.next;
            idx++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.print();
        System.out.println();
        System.out.println(ll.size);
    }
}