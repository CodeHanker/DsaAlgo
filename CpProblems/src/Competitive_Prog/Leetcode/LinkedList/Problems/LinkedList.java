package Competitive_Prog.Leetcode.LinkedList.Problems;

import java.util.Stack;

public class LinkedList {
    //HEAD
    Node head = null;
    int listSize = 0;

    public LinkedList() {
        this.head = null;
        this.listSize = 0;
    }

    //addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //modify it later
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void addAtPosition(int data, int position) {
        //position : 0 <= position < n
        if(position < 0) {
            System.out.println("Operation failed : Invalid position");
            return;
        }

        Node newNode = new Node(data);

        //add node at position at 0
        if(position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node nodeBeforeAdd = head;
        int count = 0;             //as count or index starts from 0

        while( count < position-1 ) {
            count++;
            if (nodeBeforeAdd.next != null) {
                nodeBeforeAdd = nodeBeforeAdd.next;
            } else {
                System.out.println("Operation failed : Invalid position");
                return;
            }
        }
        //saving nexNode first
        Node next = nodeBeforeAdd.next;
        nodeBeforeAdd.next = newNode;
        newNode.next = next;
    }

    public int getListSize() {
        int size = 0;

        if (head == null) {
            return size;
        }

        Node currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }

        return size;
    }

    //ACUTUALLY REVERSING LINKEDLIST on it's place
    public void reverseListActually() {
        //time complexity : O(n)
        //Auxiliary space : O(1)  //constant
        if (head == null) {
            System.out.println("List is empty !:)");
            return;
        }

        Node currNode = head;
        Node prev = null;
        while(currNode != null) {

            Node next = currNode.next;

            currNode.next = prev;  //1 -> null,  2 -> 1,  3 -> 2
            prev = currNode;       //1,          2,       3


            currNode = next;
        }
        head = prev;
    }


    public void printList() {
        //time complexity : O(n)
        if (head == null) {
            System.out.println("List is empty !:)");
            return;
        }
        //traversing and printing -> for traversing always store head in a traversing node
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }


    //Print reverse of a Linked List without actually reversing
    public void printListInReverseRecursively() {
        //time complexity : O(n)
        if (head == null) {
            System.out.println("List is empty !:)");
            return;
        }
        Node currNode = head;
        System.out.print("null");
        printListInReverseRecursive(currNode);
        System.out.println();
    }
    public void printListInReverseRecursive(Node head) {

        if(head == null) {
            return;
        }
        printListInReverseRecursive(head.next);
        System.out.print(" -> " + head.data);
    }

    public void printListInReverseUsingStack() {
        //time complexity : O(n)
        //auxiliary space complexity : O(n)
        if (head == null) {
            System.out.println("List is empty !:)");
            return;
        }

        Node currNode = head;
        Stack<Integer> stack = new Stack<>();
        while(currNode != null) {
            stack.push(currNode.data);
            currNode = currNode.next;
        }
        System.out.print("null");
        while(!stack.isEmpty()) {
            System.out.print(" -> " + stack.pop());
        }
        System.out.println();
    }

    public void printListInReverseUsingStringConcatenation() {
        //time complexity : O(n)
        //REMOVED : auxiliary space complexity : O(n)
        if (head == null) {
            System.out.println("List is empty !:)");
            return;
        }
        Node currNode = head;
        String list = "";
        System.out.print("null");
        while(currNode != null) {
            list = " -> " + currNode.data + list;
            currNode = currNode.next;
        }
        System.out.println(list);
    }

    //MAIN
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.printList();
        System.out.println("ListSize : " + list.getListSize());

        list.addFirst(2);
        list.printList();
        System.out.println("ListSize : " + list.getListSize());

        list.addLast(0);
        list.printList();
        System.out.println("ListSize : " + list.getListSize());

        list.addFirst(4);
        list.printList();
        System.out.println("ListSize : " + list.getListSize());

        System.out.println("Print list recursively");
        list.printListInReverseRecursively();
        System.out.println("Print list using stack");
        list.printListInReverseUsingStack();
        System.out.println("Print list using stack concatenation");
        list.printListInReverseUsingStringConcatenation();

        list.printList();
        System.out.println("ListSize : " + list.getListSize());
        System.out.println("Adding data : 3 at position : 2");
        list.addAtPosition(3, 2);
        list.printList();
        System.out.println("ListSize : " + list.getListSize());

        System.out.println("Adding data : 7 at position : 6");
        list.addAtPosition(7, 6);
        list.printList();
        System.out.println("ListSize : " + list.getListSize());

        System.out.println("Printing list actually-reversed :");
        list.reverseListActually();
        list.printList();

    }

}

