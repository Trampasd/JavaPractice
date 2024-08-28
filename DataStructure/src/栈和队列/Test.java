package 栈和队列;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(20);
        s.push(30);
        System.out.println(p(s));
        System.out.println(s.peek());
    }

    public static int p(Stack<Integer> s) {
        return s.pop();
    }

    public static void main2(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(5);myQueue.offer(6);

        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }
    public static void main1(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

        Queue<Integer> q1 = new LinkedList<>();
        Deque<Integer> q2 = new LinkedList<>();

        System.out.println(q1.offer(1));
        System.out.println(q1.offer(2));
        System.out.println(q1.poll());

    }

    public static void rotate(int[] nums, int k) {
        int[] end = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            end[(i + k) % nums.length] = nums[i];
        }

        for(int i = 0; i < end.length; i++) {
            nums[i] = end[i];
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                //左括号入栈
                stack.push(c);
            }else {
                //右括号
                if(stack.empty()) {
                    return false;
                }

                char ch = stack.peek();

                if((c == ')' && ch == '(') || (c == '}' && ch == '{') ||
                        (c == ']' && ch == '[')) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        if(!stack.empty()) {
            return false;
        }

        return true;
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String s : tokens) {
            if(!isOperation(s)) {
                //是数字进栈
                stack.push(Integer.parseInt(s));
            }else {
                //不是数字从栈中拿出两个元素
                if(s.equals("+")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a+b);
                }
                if(s.equals("-")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a-b);
                }
                if(s.equals("*")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a*b);
                }
                if(s.equals("/")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a/b);
                }
            }
        }
        return stack.pop();
    }

    public static boolean isOperation(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return true;
        }

        return false;
    }
}
