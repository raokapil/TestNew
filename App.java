package Program;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        LinkedList ll = new LinkedList();
        ll.head = new LinkedList.Node(1);
        LinkedList.Node n1 = new LinkedList.Node(2);
        LinkedList.Node n2 = new LinkedList.Node(3);

        ll.head.next = n1;
        n1.next = n2;

        ll.head = ll.insertionAtBeginning(ll.head);
        ll.head = ll.insertionAtMid(ll.head, "2");
        ll.head = ll.insertionAtEnd(ll.head);

       // ll.head = ll.deletion(3);



        ll.traverse(ll.head);

    }


}
