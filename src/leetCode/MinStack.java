package leetCode;

import java.util.Stack;

public class MinStack {

    int min;
    int tmp;
    Stack<Integer> s1 = new Stack<Integer>(); 
    Stack<Integer> s2 = new Stack<Integer>(); 
    public void push(int node) {
        s1.push(node);
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int min() {
        while(!s1.empty()){
            tmp = s1.pop();
            if(s2.empty()){
                min = tmp;
            }
            else {
                min = tmp<min?tmp:min;
            }
            s2.push(tmp);
        }
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        return min;
    }
    
    public static void main(String[] args) {
    	MinStack s = new MinStack();
		for (int i = 0; i < 10; i++) {
			s.push((int)(Math.random()*10));
		}
		System.out.println(s.min());
		for (int i = 0; i < 10; i++) {
			System.out.print(s.pop());
		}
	}
}
