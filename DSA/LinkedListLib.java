import java.util.LinkedList;

class LinkedListLib {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(30);
        list.add(35);
        list.add(13);
        list.add(23);

        list.add(0, 15);

        list.remove(1);

        list.addFirst(76);
        
        list.addLast(76);

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        
        System.out.println(list.get(4));

        list.clear();

        System.out.println(list);

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println(fruits);
        
        fruits.remove(3);
        fruits.removeFirst();
        System.out.print(fruits);
    }
}