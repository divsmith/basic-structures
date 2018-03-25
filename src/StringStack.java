/**
 * Created by parker on 3/25/18.
 */
public class StringStack {

    private Node first = null;

    private class Node {
        String item;
        Node next;
    }

    public void push(String item)
    {
        Node oldfirst = this.first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public String pop()
    {
        String item = first.item;
        first = first.next;
        return item;
    }

    public boolean isEmpty()
    {
        return first == null;
    }
}
