import java.util.LinkedList;

public class DoublyLinkedListLib {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        list.addFirst(1);
        list.addLast(9);

        System.err.println(list);
    }
}
