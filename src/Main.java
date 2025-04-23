public class Main {
    public static void main(String[] args) throws InterruptedException {
//       List<String> myList = new ArrayList<>();
//       myList.add("Python");
//       myList.add("java");
//       myList.add("C++");
//       System.out.println("List of elements : "+myList);
//
//       Set<String> mySet = new HashSet<>();
//       mySet.add("Apple");
//       mySet.add("Banana");
//       System.out.println("Set of elements : "+mySet);
//
//       Map<String, Integer> myMap = new HashMap<>();
//       myMap.put("Apple", 1);
//       myMap.put("Banana", 2);
//       System.out.println("Map of elements : "+myMap);
//
//       Iterator<String> iterator = myList.iterator();
//       while (iterator.hasNext()) {
//          System.out.println(iterator.next());
//          iterator.remove();
//       }
//       System.out.println("List of elements : "+myList);
//       while (iterator.hasNext()) {
//          System.out.println(iterator.next());
//          iterator.remove();
//       }
//       PriorityQueue<String> myPriorityQueue = new PriorityQueue<>();
//       myPriorityQueue.offer("Apple");
//       myPriorityQueue.offer("Banana");
//       myPriorityQueue.offer("Python");
//       myPriorityQueue.offer("C++");
//
//       System.out.println("Priority queue : "+myPriorityQueue);
//
//       Person person1 = new Person(1, "Shiva", 27);
//       Person person2 = new Person(2, "Shiva", 27);
//       Map<Person, Integer> personMap = new HashMap<>();
//       personMap.put(person1, 1);
//       personMap.put(person2, 2);
//       System.out.println("Map of elements : "+personMap);

//       for(int i=0; i<100; i++){
//          Thread thread = new Thread(new NumberPrinter(i));
//          thread.start();
//       }
//        Runnable r = new NewState();
//        Thread t = new Thread(r);
//        System.out.println(t.getState());

//        Runnable r = new RunnableState();
//        Thread t = new Thread(r);
//        t.setName("Thread112");
//        t.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(t.getState());
//        }
//        Runnable r1 = new BlockedState();
//        Thread t1 = new Thread(r1);
//        Runnable r2 = new BlockedState();
//        Thread t2 = new Thread(r2);
//
//        t1.start();
//        t2.start();
//
//        Thread.sleep(1000);
//        System.out.println(t2.getState());
//        System.exit(0);

//        Runnable r = new WaitingState2();
//        Thread t = new Thread(r);
//        t.start();
//        Thread.sleep(5000);
//        System.out.println(t.getState());

        Runnable r = new TerminatedState();
        Thread thread = new Thread(r);
        thread.start();
        Thread.sleep(1000);
        System.out.println(thread.getState());

    }
}