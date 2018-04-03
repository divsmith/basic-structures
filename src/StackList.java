import java.util.Iterator;

/**
 * Created by parker on 3/25/18.
 */
public class StackList<Item> implements StackInterface<Item>{

    private Node first = null;

    private class Node {
        Item item;
        Node next;
    }

    public void push(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        return item;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;

        public boolean hasNext()
        {
            return current != null;
        }
        public void remove() { /* not supported */ }
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
