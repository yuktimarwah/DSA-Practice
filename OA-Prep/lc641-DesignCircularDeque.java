class MyCircularDeque {

    int[] arr;
    int front;
    int rear;

    public MyCircularDeque(int k) {

        arr = new int[k];
        front = -1;
        rear = -1;
        
    }
    
    public boolean insertFront(int value) {

        if (isFull()) {
            
            return false;

        }

        if (isEmpty()) {
            
           front = arr.length - 1;
            rear = front;
            arr[front] = value;
        }

        else if (front == 0) {

            front = arr.length - 1;
            arr[front] = value;


        }

        else {
            
            front = front - 1;
            arr[front] = value;

        }

        return true;


        
    }
    
    public boolean insertLast(int value) {

        if (isFull()) {
            
            return false;

        }

        if (isEmpty()) {

            if (front == -1) {
                front++;
            }
            rear++;
            arr[front] = value;
            return true;

        }
        else {

            rear = (rear + 1) % arr.length;
            arr[rear] = value;
            return true;

        }    
        
    }
    
    public boolean deleteFront() {

        if (isEmpty()) return false;

        if (front == rear) {
            arr[front] = 0;
            rear = -1;
            front = -1;
            return true;
        }

        arr[front] = 0;
        front = (front + 1) % arr.length;
        return true;
        
    }
    
    public boolean deleteLast() {

        if (isEmpty()) return false;

        if (rear == front) {
            arr[rear] = 0;
            rear = -1;
            front = -1;
            return true;
        }

        arr[rear] = 0;
        rear = (rear - 1 + arr.length) % arr.length;
        return true;
        
    }
    
    public int getFront() {

        if (isEmpty()) return -1;

        return arr[front];
        
    }
    
    public int getRear() {

        if (isEmpty()) return -1;

        return arr[rear];
        
    }
    
    public boolean isEmpty() {

        if (front == -1 && rear == -1) return true;
        else return false;
        
    }
    
    public boolean isFull() {

        if ((rear + 1) % arr.length == front) return true;
        else return false;

    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
