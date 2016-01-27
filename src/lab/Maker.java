package lab;

import java.util.ArrayList;

/**
 * Created by A on 2016-01-02.
 */
public class Maker {

    ArrayList list = new ArrayList();


    void add(){
        for (int i = 0; i<800000; i++)
        {
            list.add(new Sth());

        }
        System.out.println(list);
    }


}
