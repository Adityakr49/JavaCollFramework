package DataStructure;
import java.util.ArrayList;
/*The difference between a built-in array(Static) and an ArrayList(Dynamic) in Java,
is that the size of an array cannot be modified
(if you want to add or remove elements to/from an array, you have to create a new one).
While elements can be added and removed from an ArrayList whenever you want.
 */
class ArrayListExample {
    public static void main(String[] args) {
        // create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        // print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // get the element at index 1
        int element = numbers.get(1);
        System.out.println("Element at index 1: " + element);

        // remove the element at index 2
        numbers.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + numbers);

        // check the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);
    }
}
/*
Constructor	                            Description
ArrayList()	                            Creates an empty ArrayList with an initial capacity of 10.
ArrayList(int initialCapacity)	        Creates an empty ArrayList with the specified initial capacity.
ArrayList(Collection<? extends E> c)	Creates an ArrayList that contains the elements of the specified collection,
                                        in the order they are returned by the collection's iterator.
 */
/*
Return Type 	Method	                        Description
boolean	        add(E element)	                Appends the specified element to the end of the list.
void	        add(int index, E element)	    Inserts the specified element at the specified position in the list.
void	        clear()	                        Removes all elements from the list.
boolean	        contains(Object o)	            Returns true if the list contains the specified element.
E	            get(int index)	                Returns the element at the specified position in the list.
int	            indexOf(Object o)	            Returns the index of the first occurrence of the specified
                                                element in the list, or -1 if the element is not found.
boolean	        isEmpty()	                    Returns true if the list contains no elements.
int	            size()	                        Returns the number of elements in the list.
E	            remove(int index)	            Removes the element at the specified position in the list and returns it.
boolean	        remove(Object o)	            Removes the first occurrence of the specified element from
                                                the list, if it is present.
E	            set(int index, E element)	    Replaces the element at the specified position in the
                                                list with the specified element, and returns the old element.
Object[]	    toArray()	                    Returns an array containing all of the elements in the list,
                                                in the same order as they are stored in the list.
<T> T[]	        toArray(T[] a)	                Returns an array containing all of the elements in the list,
                                                in the same order as they are stored in the list, and of the
                                                specified runtime type.

E -> ArrayList<Integer>    E=Integer
 */