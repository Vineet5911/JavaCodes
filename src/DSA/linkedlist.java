package DSA;

public class linkedlist {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addLast(2);
        ll.addNode(4);
        ll.addLast(3);
        ll.addNode(6);
        ll.print();
    }
    public class node {
        int data;
        node next;
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    node head;
    node tail;
    public void addNode(int data) {
        node nnd = new node(data);
        if (head == null) {
            return;
        }
        nnd.next = head;
        head = nnd;
    }
    public void addLast(int data) {
        node nnd = new node(data);
        if (head == null) {
            head = nnd;
            tail = nnd;
            return;
        }
        tail.next = nnd;
        tail = nnd;
    }
    public void print(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}