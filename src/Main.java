public class Main {

    public static void main(String[] args) {
	// write your code here

        StackArray<Integer> sa = new StackArray<>();
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.push(4);

        for (int i : sa)
        {
            System.out.println(i);
        }
    }
}
