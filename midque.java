import java.util.*;

public class midque
{
    static Queue<Integer> q = new LinkedList<>();
    static Queue<Integer> q1 = new LinkedList<>();

    public static void sep()
    {
        int n = q.size();
        int m = n / 2;

        for (int i = 0; i < m; i++)
        {
            if (i < m)
                q1.add(q.poll());
        }
    }

    public static void join()
    {
        int n = q1.size() + q.size();

        while (!q1.isEmpty())
        {
            q.add(q1.poll());
            q.add(q.poll());
        }

        if(n % 2 != 0)
        {
            q.add(q.poll());
        }
    }

    public static void dis()
    {
        while (!q.isEmpty())
        {
            System.out.print(q.poll() + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        sep();
        join();
        dis();
    }
}
