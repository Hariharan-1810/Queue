import java.util.*;

public class rev
{
    static Queue<Integer> q = new LinkedList<>();
    
    public static void reverseQueue()
    {
        if (q.isEmpty())
        {
            return;
        }
        else
        {
            int temp = q.poll();
            reverseQueue();
            q.add(temp);
        }
    }

    public static void main(String[] args)
    {
        q.add(1);
        q.add(2);
        q.add(3);

        reverseQueue();
        System.out.println(q);
    }   
}