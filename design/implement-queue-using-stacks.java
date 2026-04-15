class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> helper;
    public MyQueue() {
        stack = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
       if (helper.isEmpty()) {
            while (!stack.isEmpty()) {
                helper.push(stack.pop());
            }
        }
        return helper.pop();
    }
    
    public int peek() {
        if (helper.isEmpty()) {
            while (!stack.isEmpty()) {
                helper.push(stack.pop());
            }
        }
        return helper.peek();
    }
    
    public boolean empty() {
       return stack.isEmpty() && helper.isEmpty();
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