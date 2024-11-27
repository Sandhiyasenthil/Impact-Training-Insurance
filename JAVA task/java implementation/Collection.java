import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class Collection { 
    public static void main(String[] args) {
        CollectionPractice practice = new CollectionPractice();
        practice.display(); // Corrected method call
    }
}

class CollectionPractice {
    void display() {
        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        System.out.println("ArrayList: " + list);

        // LinkedList
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Sandhiya");
        linked.add("Janani");
        linked.add("Janu");
        System.out.println("LinkedList: " + linked);

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Ab");
        queue.add("Bo");
        queue.add("Cha");
        System.out.println("Queue Poll: " + queue.poll()); // Removes and returns the head
        System.out.println("Queue After Poll: " + queue);

        // HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Jan");
        set.add("Babu");
        set.add("Demo");
        set.add("Demo"); // Duplicate, will not be added
        System.out.println("HashSet: " + set);

        // LinkedHashSet
        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(1);
        linkedhashset.add(6);
        linkedhashset.add(0);
        linkedhashset.add(55);
        System.out.println("LinkedHashSet: " + linkedhashset);

        // TreeSet
        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(3);
        treeset.add(1);
        treeset.add(2);
        treeset.add(3); // Duplicate, will not be added
        System.out.println("TreeSet: " + treeset);
    }
}

