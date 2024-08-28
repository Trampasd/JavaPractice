package 栈和队列.TIQueue;

import java.util.Stack;

class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;


    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    //入栈统一放入s1栈当中
    public void push(int x) {
        s1.push(x);
    }

    //出栈统一出s2的
    public int pop() {
        if (empty()) {
            return -1;
        }

        if (s2.empty()) {
            while (!s1.empty()) {
                int ret = s1.pop();
                s2.push(ret);
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (empty()) {
            return -1;
        }

        if (s2.empty()) {
            while (!s1.empty()) {
                int ret = s1.pop();
                s2.push(ret);
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
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
