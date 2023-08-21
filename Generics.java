package DataStructure;

import java.util.ArrayList;

class container<T extends Number>
{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<? extends Number> obj)
    {}
    public void demo1(ArrayList<? extends T> obj)
    {
            //? Subclass of T
    }
    public void demo2(ArrayList<? super T> obj)
    {
        //? Super class of T
    }
}

class Generics {
    public static void main(String[] args) {
        //Passing a class
        container<Number> obj=new container();

        //Want it to be no->Integer,Double,Float etc class extends Number class
        //Include <T extend Number> while declaring container
        container<Number> obj1=new container();

        obj.show();
        obj.demo(new ArrayList<Number>());
    }
}
