package lab;

import java.util.*;

/**
 * Created by A on 2016-01-02.
 */
public class Test {


    public long addAll(Collection c, Collection c2)
    {
        long start = System.nanoTime();
        c2.addAll(c);
        long stop = System.nanoTime();
        return(stop-start);
    }
    public long clear(Collection c)
    {
        long start = System.nanoTime();
        c.clear();
        long stop = System.nanoTime();
        return(stop-start);
    }
    public long get(Collection c)
    {
        Iterator itr = c.iterator();
        long start = System.nanoTime();
        while (itr.hasNext())
        {
            itr.next();

        }
        long stop = System.nanoTime();
        return(stop-start);

    }

    public long sort(List c)
    {
        long start = System.nanoTime();
        Collections.sort(c);
        long stop = System.nanoTime();
        return(stop-start);
    }


}
