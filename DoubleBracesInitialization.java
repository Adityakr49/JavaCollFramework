package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBracesInitialization {
    public static void main(String[] args) {
        //List<Integer> list= Arrays.asList(56,67,90);
        List<Integer> list=new ArrayList<Integer>()
        {{
            add(56);
            add(67);
            add(90);
        }};
        //list.add(56);
        //list.add(67);
        //list.add(90);
        for (int i:
        list){
            System.out.println(i);
        }
    }
}
