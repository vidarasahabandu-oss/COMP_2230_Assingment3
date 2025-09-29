


/**
 * Represents a linked implementation of a stack.
 *
 * @author Java Foundations 
 * @version 4.0
 */
// LinkedStack.java
// A stack that uses linked nodes to store items (like a pile of plates).
// This is the solution for Problem 1.

public class LinkedStack<T> implements StackADT<T> {
    // How many items are in the stack right now
    protected int count;

    // The very top item in the stack
    protected LinearNode<T> top;

    /**
     * Makes an empty stack.
     */
    public LinkedStack() {
        count = 0;
        top = null;
    }

    /**
     * Puts a new item on top of the stack.
     * @param element the item to add
     */
    @Override
    public void push(T element) {
        // Make a new node to hold the item
        LinearNode<T> temp = new LinearNode<>(element);

        // Connect this new node to whatever was on top
        temp.setNext(top);

        // Now say this new node is the top
        top = temp;

        // Stack has one more item
        count++;
    }

    /**
     * Takes the top item off the stack and gives it back.
     * @return the item removed from the top
     * @throws EmptyCollectionException if the stack has no items
     */
    @Override
    public T pop() {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        // Save the item that’s on top
        T result = top.getElement();

        // Move the "top" pointer to the next item down
        top = top.getNext();

        // Stack now has one less item
        count--;

        return result;
    }

    /**
     * Shows the top item without taking it away.
     * @return the item at the top
     * @throws EmptyCollectionException if the stack has no items
     */
    @Override
    public T peek() {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        return top.getElement();
    }

    /**
     * Checks if the stack is empty or not.
     * @return true if empty, false if not
     */
    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    /**
     * Tells how many items are in the stack.
     * @return the number of items
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Shows the whole stack as a text string.
     * Top item comes first.
     * Example: Top -> [30, 20, 10]
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Top -> [");

        LinearNode<T> current = top;

        // Walk through the stack and add each item to the string
        while (current != null) {
            sb.append(current.getElement());
            current = current.getNext();

            // Put a comma between items
            if (current != null) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }
}
