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
        }
        else if (tail == s.length)
        {
            if (head == 0)
            {
                // If the total number of array indicies being
                // used is less than one half of the total available,
                // rezero the array and keep it the same size.
                // Otherwise, rezero it and resize it to twice the length.
                resize((tail - head) + 1 <= (s.length / 2) ? s.length : s.length * 2);
            }
            else
            {
                // Wrap the tail pointer around to the front of the array
                // when there's room to avoid having to resize
                tail = 0;
            }
        }
        else if (tail == head)
        {
            // The tail pointer has wrapped around to zero and caught
            // up to the head pointer. We need to resize the array larger
            // and rezero the array.
            resize(s.length * 2);
        }

        s[tail] = item;
        tail++;
    }

    public String dequeue()
    {
        String item = s[head];
        s[head] = null;
        head++;

        // If the total number of array indicies being
        // used is less than one fourth the total available,
        // rezero the array and resize it to one half the
        // current size.
        if (tail > head && (tail - head) <= (s.length / 4))
        {
            resize(s.length / 2);
        }
        else if (tail < head && ((s.length - 1) - head + tail) <= (s.length / 4))
        {
            resize(s.length / 2);
        }

        return item;
    }

    private void resize(int capacity)
    {
        String[] resized = new String[capacity];

        if (head < tail || s.length == 2)
        {
            // In this case, the tail pointer
            // hasn't wrapped around behind
            // the head pointer.
            for (int i = head; i < tail; i++)
            {
                resized[i - head] = s[i];
            }

            s = resized;

            tail -= head;
        }
        else
        {
            // Copy the range from s[head] to s[s.length - 1]
            for (int i = head; i < s.length; i++)
            {
                resized[i - head] = s[i];
            }

            // Copy the range from zero to tail
            for (int i = 0; i < tail; i++)
            {
                resized[i + tail] = s[i];
            }

            tail = s.length;

            s = resized;
        }

        head = 0;
    }


}
