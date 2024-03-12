package DSA.stack;
public class ArrayStack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(12);
        stack.push(33);
        stack.push(65);
        stack.push(11);
        stack.push(87);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    public ArrayStack(){
        this(DEFAULT_SIZE);
    }
    public ArrayStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot pop from an empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        //return data[ptr--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("cannot peek from an empty stack");
        }
        return data[ptr];
    }
    private boolean isFull(){
        return ptr == data.length - 1;
    }
    private boolean isEmpty(){
        return ptr == - 1;
    }
}