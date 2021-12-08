class MyCircularQueue {

    int[] arr;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        front = 0;
        rear = 0;
        arr = new int[k];
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        arr[(rear) % arr.length] = value;
        rear++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        front++;
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return arr[front % arr.length];
    }

    public int Rear() {
        if(isEmpty()) return -1;
        return arr[(rear - 1) % arr.length];
    }

    public boolean isEmpty() {
        return (front == rear);
    }

    public boolean isFull() {
        return rear - front == arr.length;
    }
}