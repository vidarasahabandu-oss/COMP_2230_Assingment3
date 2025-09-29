
public class StackTest {
    public static void main(String[] args) {
        LinkedStack<Integer> s = new LinkedStack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack: " + s);   // Top -> [30, 20, 10]
        System.out.println("peek: " + s.peek());
        System.out.println("pop:  " + s.pop());
        System.out.println("After pop: " + s + " (size=" + s.size() + ")");
    }
}


