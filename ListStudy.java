package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList();
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(34);
        values.add(1,9);
        Collections.sort(values);
//        for(int i:values)//int from wrapper class(benefit of wrapper class) can also use Integer
//        {
//            System.out.println(i);
//        }
        values.forEach(System.out::println);//Stream API .. Lambda Expression
    }
}
