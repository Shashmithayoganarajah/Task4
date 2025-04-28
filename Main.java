// Node class: Each node holds data and a link to the next node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack {
    Node top; // Top refers to the head node

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push (insert) an element at the top
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;  // New node points to old top
        top = newNode;       // New node becomes top
        System.out.println(data + " pushed into stack");
    }

    // Pop (remove) the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;  // Move top to next node
        return poppedData;
    }

    // Peek (see) the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Get the size of the stack
    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Clear the stack
    public void clear() {
        top = null;
        System.out.println("Stack cleared");
    }
}

// Queue class using Linked List
class Queue {
    Node head;
    Node tail; // To efficiently add to the rear

    // Check if queue is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Add (enqueue) an element to the queue
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

    // Remove (dequeue) the front element
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removedData = head.data;
        head = head.next;
        if (head == null) {
            tail = null; // If the queue becomes empty, reset tail
        }
        return removedData;
    }

    // Peek (see) the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    // Get the size of the queue
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Clear the queue
    public void clear() {
        head = null;
        tail = null;
        System.out.println("Queue cleared");
    }
}

// Main class to test
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
