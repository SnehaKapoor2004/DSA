import java.util.*;
class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static Node deleteAtFront(Node head) {
        if (head == null)
            return null;
        head = head.next;
        return head;
    }
    static Node deleteAtEnd(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        Node temp = head;
        System.out.println("Before Delete:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        head = deleteAtFront(head);
        System.out.println("\nAfter Delete Front:");
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        head = deleteAtEnd(head);
        System.out.println("\nAfter Delete End:");
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}