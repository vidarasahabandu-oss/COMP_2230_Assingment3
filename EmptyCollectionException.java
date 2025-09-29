

/**
 * Represents the situation in which a collection is empty.
 *
 * @author Java Foundations
 * @version 4.0
 */
// EmptyCollectionException.java
// A custom error message we use when someone tries
// to take from a stack (or other collection) that has nothing inside.

public class EmptyCollectionException extends RuntimeException {

    /**
     * Makes an exception with a message like:
     * "The stack is empty."
     * or "The queue is empty."
     * @param collection the type of collection (example: "stack")
     */
    public EmptyCollectionException(String collection) {
        super("The " + collection + " is empty.");
    }

    /**
     * Makes an exception with a message plus extra details.
     * Example: "The stack is empty. Cannot pop."
     * @param collection the type of collection
     * @param message extra details about the error
     */
    public EmptyCollectionException(String collection, String message) {
        super("The " + collection + " is empty. " + message);
    }
}
