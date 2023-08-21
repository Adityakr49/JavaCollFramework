package DataStructure;
import java.util.LinkedList;
/*
One of the key advantages of a LinkedList is that it allows for
constant-time insertion and removal of elements, even in the middle
of the list, whereas with an array, these operations can be much slower.
However, accessing an element at a particular index in a LinkedList can
be slower than with an array, since you have to traverse the list from
the beginning until you reach the desired element.
*/
class LinkedListExample {
        public static void main(String[] args) {
            LinkedList<String> list1 = new LinkedList<>();
            // Add some elements to the list
            list1.add("Apple");
            list1.add("Banana");
            list1.add("Cherry");

            // Print the size of the list
            System.out.println("Size of list: " + list1.size());

            // Print the elements of the list
            System.out.println("Elements of list:");
            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i));
            }


            //Integer example
            LinkedList<Integer> list = new LinkedList<>();
            // Add 10 integers to the list
            for (int i = 1; i <= 10; i++) {
                list.add(i);
            }
            // Print the size of the list
            System.out.println("Size of list: " + list.size());

            // Remove the first element from the list
            list.removeFirst();

            // Print the updated size of the list
            System.out.println("Size of list after removing an element: " + list.size());

            // Check if the list contains the number 5
            boolean containsFive = list.contains(5);
            System.out.println("Does the list contain the number 5? " + containsFive);

            // Get the index of the number 8 in the list
            int index = list.indexOf(8);
            System.out.println("Index of number 8 in the list: " + index);

            // Print the elements of the list
            System.out.println("Elements of list:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

}
/*
Constructor	                                Description
LinkedList()	                            Creates an empty linked list.
LinkedList(Collection<? extends E> c)	    Creates a linked list containing the elements of the specified collection,
                                            in the order they are returned by the collection's iterator.
LinkedList(List<? extends E> list)	        Creates a linked list containing the elements of the specified list,
                                            in the order they are returned by the list's iterator.
LinkedList(E[] arr)	Creates a linked list   containing the elements of the specified array,
                                            in the order they appear in the array.
LinkedList(Node<? extends E> node)	        Creates a linked list with the specified node as its head.
LinkedList(LinkedList<? extends E> list)	Creates a shallow copy of the specified linked list.
 */
/*
Method	                            Description
add(E element)	                    Adds the specified element to the end of the list.
add(int index, E element)	        Inserts the specified element at the specified position in the list.
addAll(Collection<? extends E> c)	Appends all of the elements in the specified collection to the end of the list.
clear()	                            Removes all of the elements from the list.
contains(Object o)	                Returns true if the list contains the specified element.
get(int index)	                    Returns the element at the specified position in the list.
indexOf(Object o)	                Returns the index of the first occurrence of the specified element in the list, or -1 if it is not found.
isEmpty()	                        Returns true if the list is empty.
iterator()	                        Returns an iterator over the elements in the list (in proper sequence).
lastIndexOf(Object o)	            Returns the index of the last occurrence of the specified element in the list, or -1 if it is not found.
remove(Object o)	                Removes the first occurrence of the specified element from the list, if it is present.
remove(int index)	                Removes the element at the specified position in the list.
removeFirst()	                    Removes and returns the first element from the list.
removeLast()	                    Removes and returns the last element from the list.
set(int index, E element)	        Replaces the element at the specified position in the list with the specified element.
size()	                            Returns the number of elements in the list.
subList(int fromIndex, int toIndex)	Returns a view of the portion of the list between the specified fromIndex (inclusive) and toIndex (exclusive).
toArray()	                        Returns an array containing all of the elements in the list (in proper sequence).
toString()	                        Returns a string representation of the list.
peek()	                            Retrieves, but does not remove, the head (first element) of the list. Returns null if the list is empty.
peekFirst()	                        Retrieves, but does not remove, the first element of the list. Returns null if the list is empty.
peekLast()	                        Retrieves, but does not remove, the last element of the list. Returns null if the list is empty.
poll()	                            Retrieves and removes the head (first element) of the list. Returns null if the list is empty.
pollFirst()	                        Retrieves and removes the first element of the list. Returns null if the list is empty.
pollLast()	                        Retrieves and removes the last element of the list. Returns null if the list is empty.
push(E element)	                    Inserts the specified element at the beginning of the list (equivalent to addFirst(E element) method).
pop()	                            Retrieves and removes the first element of the list (equivalent to removeFirst() method).
addFirst(E element)	                Inserts the specified element at the beginning of the list.
addLast(E element)	                Inserts the specified element at the end of the list (equivalent to add(E element) method).
clone()	                            Returns a shallow copy of the list.
descendingIterator()	            Returns an iterator over the elements in the list in reverse sequential order.
element()	                        Retrieves, but does not remove, the head (first element) of the list.
getFirst()	                        Returns the first element in the list.
getLast()	                        Returns the last element in the list.
offer(E element)	                Adds the specified element to the end of the list (equivalent to add(E element) method).
offerFirst(E element)	            Inserts the specified element at the beginning of the list (equivalent to addFirst(E element) method).
offerLast(E element)	            Inserts the specified element at the end of the list (equivalent to addLast(E element) method).
 */