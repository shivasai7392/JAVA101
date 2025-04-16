import java.util.*;
import java.util.ListIterator;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {
       List<String> myList = new ArrayList<>();
       myList.add("Python");
       myList.add("java");
       myList.add("C++");
       System.out.println("List of elements : "+myList);

       Set<String> mySet = new HashSet<>();
       mySet.add("Apple");
       mySet.add("Banana");
       System.out.println("Set of elements : "+mySet);

       Map<String, Integer> myMap = new HashMap<>();
       myMap.put("Apple", 1);
       myMap.put("Banana", 2);
       System.out.println("Map of elements : "+myMap);

       Iterator<String> iterator = myList.iterator();
       while (iterator.hasNext()) {
          System.out.println(iterator.next());
          iterator.remove();
       }
       System.out.println("List of elements : "+myList);
       while (iterator.hasNext()) {
          System.out.println(iterator.next());
          iterator.remove();
       }
       PriorityQueue<String> myPriorityQueue = new PriorityQueue<>();
       myPriorityQueue.offer("Apple");
       myPriorityQueue.offer("Banana");
       myPriorityQueue.offer("Python");
       myPriorityQueue.offer("C++");

       System.out.println("Priority queue : "+myPriorityQueue);

       Person person1 = new Person(1, "Shiva", 27);
       Person person2 = new Person(2, "Shiva", 27);
       Map<Person, Integer> personMap = new HashMap<>();
       personMap.put(person1, 1);
       personMap.put(person2, 2);
       System.out.println("Map of elements : "+personMap);
    }
}