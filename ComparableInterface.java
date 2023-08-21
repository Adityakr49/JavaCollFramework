package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class stud implements Comparable<stud>
{
    int rollno;
    int marks;

    public stud(int rollno,int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public String toString()
    {
        return "Student{"+rollno+", marks"+marks+"}";
    }

    @Override
    public int compareTo(stud o) {
        return this.marks>o.marks?-1:this.marks<o.marks?1:0;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        List<stud> studs = new ArrayList<stud>();
        studs.add(new stud(1, 55));
        studs.add(new stud(2, 97));
        studs.add(new stud(3, 98));
        studs.add(new stud(4, 59));
        studs.add(new stud(5, 99));
        Collections.sort(studs);
        for (stud s :
                studs) {
            System.out.println(s);
        }
    }
}
//If creating a custom class its advisable to use comparable interface otherwise if we have a class whose definition is
//fixed then use comparator