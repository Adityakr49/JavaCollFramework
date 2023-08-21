package DataStructure;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
class Colection {
    public static void main(String[] args) {
        Collection values=new ArrayList();
        values.add(3);
        values.add("Aditya");
        values.add(5.8f);
        values.add(34);
        values.remove(3);
        //Using iterator
        Iterator i= values.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        //Using for each
        for(Object j:values)
        {
            System.out.println(j);
        }
        // No feature to add elements in between some elements which is why we use List interface that extends Collection
    }
}
