package DSA.Queue;

public class queue {
    public static void main(String[] args) {
        queue q1 = new queue(4);
        q1.insert(13);
        q1.insert(23);
        q1.insert(21);
        q1.insert(11);
        q1.print();
        System.out.println(q1.remove() + " has been removed");
    }
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public queue(){
        this(DEFAULT_SIZE);
    }
    public queue(int size){
        this.data = new int[size];
    }
    public boolean insert(int size){
        if(isFull()){
            return false;
        }
        data[end++] = size;
        return true;
    }
    private int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        int removed = data[0];
        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    private int front(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        return data[0];
    }
    private boolean isFull(){
        return end == data.length;
    }
    private boolean isEmpty(){
        return end == 0;
    }
    private void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
}