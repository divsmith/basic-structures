/**
 * Created by parker on 3/30/18.
 */
public class ArrayStringStack {

    private String[] s = new String[1];
    private int n = 0;

    public void push(String item)
    {
        if (n == 0)
        {
            s[0] = item;
        }

        n++;
    }

    public String pop()
    {
        String item = s[n - 1];
        s[n - 1] = null;
        n--;
        return item;
    }

    public Boolean isEmpty()
    {
        return n == 0;
    }
}
