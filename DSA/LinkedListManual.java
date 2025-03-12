class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListManual {
    // Node first = new Node(10);
    // Node second = new Node(20);
    // first.next = second;
        // Node third = new Node(30);
        // second.next = third;
        // Node fourth = new Node(50);
        // third.next = fourth;
        
        // Node current = first;
        // while(current != null) {
        //     System.out.print(current.data + " ");
        //     current = current.next;
        // }
        
        Node head;

        public void insert(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
            }
            else {
                Node temp = head;
                while(temp.next !=null) {
                    temp = temp.next; //last node tak agye hai hum abhi ok
                }
                temp.next = newNode; //yaha pe last node ke sath naya node connect hojayega
            }
        }
        
        public void display() {
            Node temp = head;
            System.out.print("LinkedList : ");
            while(temp != null) {
                System.out.print(temp.data+"-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
        public static void main(String args[]) {
        LinkedListManual list = new LinkedListManual();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
}