package lab;

import java.util.*;

/**
 * Created by A on 2016-01-02.
 */
public class Start {

    public static void main(String [] args)
    {
        ArrayList array = new ArrayList();
        LinkedList linked = new LinkedList();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TreeSet treeSet = new TreeSet();
        Maker make = new Maker();
        Test test = new Test();
        make.add();
        long arrayAdd = test.addAll(make.list, array);
        long arrayGet = test.get(array);
        long arraySort = test.sort(array);
        long arrayClear = test.clear(array);
        long linkedAdd = test.addAll(make.list, linked);
        long linkedGet = test.get(linked);
        long linkedSort = test.sort(linked);
        long linkedClear = test.clear(linked);
        long hashSetAdd = test.addAll(make.list, hashSet);
        long hashSetGet = test.get(hashSet);
        long hashSetClear = test.clear((Collection) hashSet);
        long linkedHashSetAdd = test.addAll(make.list, linkedHashSet);
        long linkedHashGet = test.get(linkedHashSet);
        long linkedHashSetClear = test.clear((Collection) linkedHashSet);
        long treeSetAdd = test.addAll(make.list, treeSet);
        long treeSetGet = test.get(treeSet);
        long treeSetClear = test.clear((Collection) treeSet);

        Writer writer = new Writer();
        writer.write("ArrayList.txt", arrayAdd, arrayGet, arraySort, arrayClear);
        writer.write("LinkedList.txt", linkedAdd, linkedGet, linkedSort, linkedClear);
        writer.write2("HashSet.txt", hashSetAdd, hashSetGet, hashSetClear);
        writer.write2("LinkedHashSet.txt", linkedHashSetAdd, linkedHashGet, linkedHashSetClear);
        writer.write2("TreeSet.txt", treeSetAdd, treeSetGet, treeSetClear);




    }
    

}
