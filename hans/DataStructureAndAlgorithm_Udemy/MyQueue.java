/**
* implements Queue using stacks
*/

class MyQueue {
    
    Stack pushStack = new Stack();
    Stack popStack = new Stack();
    

    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        pushStack.push(String.valueOf(x));
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
      if(popStack.length > 0) return Integer.valueOf(popStack.pop().value);

      while(pushStack.length > 0) {
        popStack.push(String.valueOf(pushStack.pop().value));
      }

      return Integer.valueOf(popStack.pop().value);
    }
    
    /** Get the front element. */
    public int peek() {
        Node peekedNode = popStack.top;
        if(peekedNode == null) {
          peekedNode = pushStack.bottom;
        }
        return peekedNode != null ? Integer.valueOf(peekedNode.value) : -1;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return pushStack.length == 0 && popStack.length == 0;
    }
}