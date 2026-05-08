import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    // Constructor
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {

        // Add new element to q2
        q2.offer(x);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Remove top element
    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }

        return q1.poll();
    }

    // Get top element
    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }

        return q1.peek();
    }

    // Check if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top());   // 30

        System.out.println(st.pop());   // 30

        System.out.println(st.top());   // 20

        System.out.println(st.empty()); // false
    }
}