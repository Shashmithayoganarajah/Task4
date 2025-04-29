class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top; 

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;  
        top = newNode;      
        System.out.println(data + " pushed into stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void clear() {
        top = null;
        System.out.println("Stack cleared");
    }
}

class Queue {
    Node head;
    Node tail; 

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(data + " added to queue");
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removedData = head.data;
        head = head.next;
        if (head == null) {
            tail = null; 
        }
        return removedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void clear() {
        head = null;
        tail = null;
        System.out.println("Queue cleared");
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();

        // Stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        stack.clear();

        // Queue operations
        queue.add(100);
        queue.add(200);
        queue.add(300);
        System.out.println("Front element is: " + queue.peek());
        System.out.println(queue.remove() + " removed from queue");
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        queue.clear();
    }
}
