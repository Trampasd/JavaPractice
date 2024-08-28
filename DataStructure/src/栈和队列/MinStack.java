package 栈和队列;

import java.util.Arrays;
import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.empty()) {
            minStack.push(val);
        }else {
            if (val <= minStack.peek()) {
                minStack.push(val);
            }
        }
    }

    public void pop() {
        if(!stack.empty()) {
            int ret = stack.pop();
            if(ret == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (stack.empty()) {
            return  -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.empty()) {
            return  -1;
        }
        return minStack.peek();
    }
}
