package DataStructure;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStudy {
    public static void main(String[] args) {
        //Doesnot maintain order and dont take duplicate values
        Set<Integer> obj=new HashSet<>();
        System.out.println(obj.add(85));
        System.out.println(obj.add(23));
        System.out.println(obj.add(65));
        System.out.println(obj.add(67));
        System.out.println(obj.add(67));
        for (int i :
                obj) {
            System.out.println(i);
        }

        //Maintain in order in ascending order
        Set<Integer> obj2=new TreeSet<>();
        System.out.println(obj2.add(85));
        System.out.println(obj2.add(23));
        System.out.println(obj2.add(65));
        System.out.println(obj2.add(67));
        System.out.println(obj2.add(67));
        for (int i :
                obj2) {
            System.out.println(i);
        }
    }
}
