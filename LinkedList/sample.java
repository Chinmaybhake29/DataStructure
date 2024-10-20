package LinkedList;

public class Sample {
    private Stack_class stack1;
    private Stack_class stack2;

    public QueueUsingStacks(int size) {
        stack1 = new Stack_class();
        stack2 = new Stack_class();
        stack1.create_Stack(size);
        stack2.create_Stack(size);
    }

    // Enqueue operation: Push elements into stack1
    public void enqueue(int e) {
        if (stack1.is_Full()) {
            System.out.println("Queue is Full!");
            return;
        }
        stack1.push(e);
        System.out.println("Element " + e + " Enqueued.");
    }

    // Dequeue operation: Move elements from stack1 to stack2 and pop
    public int dequeue() {
        if (stack1.is_Empty() && stack2.is_Empty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        // Move elements from stack1 to stack2 only if stack2 is empty
        if (stack2.is_Empty()) {
            while (!stack1.is_Empty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop(); // Dequeue the element from stack2
    }

    // Print queue elements
    public void printQueue() {
        System.out.println("Queue Elements:");
        if (stack1.is_Empty() && stack2.is_Empty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        // Print elements in stack2 (already in the correct order)
        if (!stack2.is_Empty()) {
            stack2.print_Stack();
        }

        // Print elements in stack1 (reverse order)
        if (!stack1.is_Empty()) {
            Stack_class tempStack = new Stack_class();
            tempStack.create_Stack(stack1.MaxSize);
            while (!stack1.is_Empty()) {
                tempStack.push(stack1.pop());
            }
            tempStack.print_Stack();

            // Restore elements back into stack1
            while (!tempStack.is_Empty()) {
                stack1.push(tempStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Dequeued: " + queue.dequeue());
        queue.enqueue(50);
        queue.enqueue(60);
        queue.printQueue();
    }
}

