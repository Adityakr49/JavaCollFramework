package DataStructure;
@FunctionalInterface
interface A{
    //Functional Interface is the one whose only methods implementation we have to provide in implementing class
    public void show();
    String toString();
    //Acceptable because implementation provided in Object class
}
class B implements A
{
    public void show()
    {
        System.out.println("Hi");
    }
}
public class FunctIonalInterface {
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
        //Method 2
        //Ananomous class
        A obj1=new A() {
            @Override
            public void show() {
                System.out.println("Hi method 2");
            }
        };
        obj1.show();


        //Method 3
        //Lambda Expression
        A obj2=()->System.out.println("Hello");
        obj2.show();
    }
}
