/*
   it means we have to build a stack which will work as queue means fifo.
  we will make stack st which will work as queue with help of helper stack
  pushing in stack and queue both same so directly push in st
  but removal is different in both so use helper stack
  for removal as in queue removal takes place from front so it means we have to remove first element of stack but in stack first is removed in last so in first step move all above element to helper and then pop last and then again move from helper to st*/
class MyQueue {
    Stack<Integer>st;
    Stack<Integer>helper;

    public MyQueue(){
        st=new Stack<>();
        helper=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop(){
        while(st.size()>1){
            helper.push(st.pop());
        }
        int front=st.pop();
        while(helper.size()>0){
            st.push(helper.pop());
        }return front;
    }
    
    public int peek() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int front=st.peek();
        while(helper.size()>0){
            st.push(helper.pop());
        }return front;
    }
    
    public boolean empty() {
        return(st.size()==0);
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */