/**
 * Created by parker on 3/30/18.
 */
public class ArrayStringStack {

    private String[] s = new String[1];
    private int n = 0;

    public void push(String item)
    {
        if (n == s.length)
        {
            String[] larger = new String[s.length * 2];
            for (int i = 0; i < n; i++)
            {
                larger[i] = s[i];
            }

            s = larger;
        }

        s[n] = item;

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
