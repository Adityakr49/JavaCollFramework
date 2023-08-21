package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class student
{
    int rollno;
    int marks;

    public student(int rollno,int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public String toString()
    {
        return "Student{"+rollno+", marks"+marks+"}";
    }

}
public class CustomCamparator {
    public static void main(String[] args) {
        List<stud> studs=new ArrayList<stud>();
        studs.add(new stud(1,55));
        studs.add(new stud(2,97));
        studs.add(new stud(3,98));
        studs.add(new stud(4,59));
        studs.add(new stud(5,99));
        for (stud i :
                studs) {
            System.out.println(i);
        }
        Collections.sort(studs,(s1,s2)->
        {
            return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
            //return Integer.compare(s2.marks, s1.marks);
        });
        for (stud i :
                studs) {
            System.out.println(i);
        }
    }
}
