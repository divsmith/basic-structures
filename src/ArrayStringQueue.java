/**
 * Created by parker on 4/1/18.
 */
public class ArrayStringQueue {

    private int head = 0;
    private int tail = 0;
    private String[] s;

    public boolean isEmpty()
    {
        return tail == head;
    }

    public void enqueue(String item)
    {
        if (tail == 0)
        {
            s = new String[1];
            s[0] = item;
            tail++;
        }
        else if (tail == s.length)
        {
            // If the total number of array indicies being
            // used is less than one fourth of the total available,
            // rezero the array and resize it to one half the length.
            // Otherwise, rezero it and resize it to twice the length.
            resize((tail - head) + 1 < (s.length / 4) ? s.length / 2 : s.length * 2);
        }
    }

    private void resize(int capacity)
    {
        String[] resized = new String[capacity];

        for (int i = head; i < tail; i++)
        {
            resized[i - head] = s[i];
        }

        s = resized;
    }


}
