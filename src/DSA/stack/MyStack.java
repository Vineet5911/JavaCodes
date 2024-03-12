package DSA.stack;

public class MyStack {
    private class node {
        int data;
        node next;
        public node(int data) {
            this.data = data;
            next = null;
        }
    }
    class stack {
        private node head;
        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            node newNode = new node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        MyStack Stack = new MyStack();
        MyStack.stack stack = Stack.new stack();
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
