import java.util.Deque;
import java.util.LinkedList;

public class DequePractice {
    public static void main(String[] args) {
        DequeExample example=new DequeExample();
        example.display();
    }
}
class DequeExample{
    void display(){
        Deque<String> deque = new LinkedList<>();

       
        deque.addFirst("Alice");
        deque.addLast("Bob");
        deque.addFirst("Charlie");
        deque.addLast("Dave");

        System.out.println("Deque after adding elements: " + deque);

        String firstRemoved = deque.removeFirst(); 
        String lastRemoved = deque.removeLast();   

        System.out.println("Removed first element: " + firstRemoved);
        System.out.println("Removed last element: " + lastRemoved);
        System.out.println("Deque after removal: " + deque);

        
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());
    }
}


        