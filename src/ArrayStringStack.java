/**
 * Created by parker on 3/30/18.
 */
public class ArrayStringStack implements StringStackInterface{

    private String[] s = new String[1];
    private int n = 0;

    private void resize(int capacity)
    {
        String[] copy = new String[capacity];
        for (int i = 0; i < n; i++)
        {
            copy[i] = s[i];
        }

        s = copy;
    }

    public void push(String item)
    {
        if (n == s.length)
        {
            resize(s.length * 2);
        }

        s[n] = item;

        n++;
    }

    public String pop()
    {
        String item = s[n - 1];
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
