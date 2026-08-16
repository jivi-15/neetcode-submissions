class MinStack {
    Stack<Integer>st;
    Stack<Integer>minst;
    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
    }
    
    public void push(int val) {
        if(minst.isEmpty()||minst.peek()>=val){
            minst.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        int value=st.pop();
        if(value==minst.peek()){
            minst.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
