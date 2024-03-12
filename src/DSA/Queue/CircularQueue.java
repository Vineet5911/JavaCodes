package DSA.Queue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front = 0;
    private int end = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public boolean remove(int item){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return true;
    }
    private boolean isFull(){
        return size == data.length;
    }
    private boolean isEmpty(){
        return size == 0;
    }
}
