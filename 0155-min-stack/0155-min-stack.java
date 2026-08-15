class MinStack {
    Stack<Integer> st;
    Stack<Integer> MinSt;
    public MinStack() {
        st=new Stack<>();
        MinSt=new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(MinSt.size()==0 || value<MinSt.peek())MinSt.push(value);
        else MinSt.push(MinSt.peek());
    }
    
    public void pop() {
        st.pop();
        MinSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return MinSt.peek();
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