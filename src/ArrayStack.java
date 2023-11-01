public class ArrayStack<T> {
    private T[] items;
    private int top;
    private int maxSize;

    public ArrayStack(int max) {
        items = (T[]) new Object[max];
        top = -1;
        maxSize = max;
    }

    public boolean push(T item) {
        if (isFull())
            return false;
        items[++top] = item;
        return true;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Removing from empty");

        return items[top--];
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Peeking from empty");

        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(10);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek()); // should print 2
        System.out.println(stack.pop());  // should print 2
        System.out.println(stack.peek()); // should print 1
    }
}
