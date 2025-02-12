class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);

        // if (newNode == null) {
        // return false;
        // }

        if (head == null) {
            head = newNode;
            return true;
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);
        return true;
    }

    public boolean insert(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 0) {
            return false;
        }

        if (position == 1) {
            newNode.setNext(head.getNext());
            head = newNode;
            return true;
        }

        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
        }
        newNode.setNext(prev.getNext());
        prev.setNext(newNode);
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(12);
        ll.insert(15);
        ll.insert(20);
        ll.insert(28);
        ll.insert(10);
        ll.insert(89, 3);
        ll.insert(70, 7);
        ll.display();
    }
}
