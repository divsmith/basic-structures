/**
 * Created by parker on 4/2/18.
 */
public interface QueueInterface<Item> {
    public void enqueue(Item item);
    public Item dequeue();
}
