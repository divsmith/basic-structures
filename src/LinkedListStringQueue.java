/**
 * Created by parker on 3/31/18.
 */
public class LinkedListStringQueue {

    private Node last = null;
    private Node first = null;

    private class Node
    {
        String item;
        Node next;
    }

    public String dequeue()
    {
        String item = first.item;
        first = first.next;
        return item;
    }

    public void enqueue(String item)
    {
        Node node = new Node();
        node.item = item;
        node.next = null;

        if (first == null)
        {
            first = node;
        }
        else
        {
            last.next = node;
        }

        last = node;
    }

    public boolean isEmpty()
    {
        return first == null;
    }
}
