package DSA;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
    }
    public class node{
        int data;
        node next;
        node prev;

        public node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    node head;
    node tail;
    public void add(int data){
        node nnd = new node(data);
        if(head == null){
            head = tail = nnd;
        }
        tail.next = nnd;
        nnd.prev = tail;
        tail = nnd;
    }
    public void print(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
