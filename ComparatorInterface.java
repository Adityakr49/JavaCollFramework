package DataStructure;

import java.util.*;

class ComparImp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 > o2 ? 1 : -1;
        //int a=o1%10;
        //int b=o2%10;
        //return a>b?1:-1;

        //return ->1 if o1>o2  ->0 if o1=o2  ->-1 if o1<o2;
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList();
        values.add(326);
        values.add(472);
        values.add(51);
        values.add(340);
        values.add(99);
        Comparator<Integer> com = new ComparImp();
        //If I want to sort it using different requirement like sorting according to last digit then i can change the compare
        //fn of comparator implementing class

        Collections.sort(values, com);
        for (int i : values) {
            System.out.println(i);
        }
        Comparator<Integer> com2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 % 10 > o2 % 10) ? 1 : -1;
                //Aka anonomous class
            }
        };

        //or
        Comparator<Integer> com3=(Integer o1, Integer o2)->
        {
            return (o1 % 10 > o2 % 10) ? 1 : -1;
        };
        //Collections.sort(values, com3);

        //or
        Collections.sort(values,(o1,o2)->
        {
            return (o1 % 10 > o2 % 10) ? 1 : -1;
        });
        for (int j :
                values) {
            System.out.println(j);
        }
    }
}
//Got ConcurrentModificationException because by mistake wrote the next modification code inside for each 1st which
//tried to change the collection while i was iterating


/*
//To sort array of string in order of their length
public class Comp implements Comparator<String>{
    @Override
    public int compare(String str1,String str2){
        return Integer.compare(str1.length(),str2.length());
    }
}
*/
