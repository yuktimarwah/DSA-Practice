class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> miniSt = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {

        st.push(value);

        if (miniSt.isEmpty()) {

            miniSt.push(value);
        }
        else if (miniSt.peek() >= value) {

            miniSt.push(value);
        }
        
    }
    
    public void pop() {

        int poped = st.pop();

        if (poped == miniSt.peek()) {
            miniSt.pop();
        }
        
    }
    
    public int top() {

        return st.peek();
        
    }
    
    public int getMin() {

        return miniSt.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
