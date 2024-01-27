public class App {
    public static void main(String[] args) throws Exception {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(10);
        myLinkedList.append(11);
        myLinkedList.append(12);
        myLinkedList.append(13);
        myLinkedList.getTail().next = myLinkedList.getHead().next;

        System.out.println("Has Loop:");
        System.out.println( myLinkedList.hasLoop());

    }
}
