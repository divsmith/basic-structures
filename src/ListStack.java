/**
 * Created by parker on 3/25/18.
 */
public class ListStack<Item>{

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
}
