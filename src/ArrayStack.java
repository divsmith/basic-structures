/**
 * Created by parker on 3/30/18.
 */
public class ArrayStack<Item> implements StackInterface<Item>{

    private Item[] s = (Item[]) new Object[1];
    private int n = 0;

    private void resize(int capacity)
    {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++)
        {
            copy[i] = s[i];
        }

        s = copy;
    }

    public void push(Item item)
    {
        if (n == s.length)
        {
            resize(s.length * 2);
        }

        s[n] = item;

        n++;
    }

    public Item pop()
    {
        Item item = s[n - 1];
        s[n - 1] = null;
        n--;

        if (n == s.length / 4)
        {
            resize(s.length / 2);
        }
        return item;
    }

    public boolean isEmpty()
    {
        return n == 0;
    }
}
