package DataStructure;
import java.util.Arrays;

/*
Arrays is a utility class it has static methods which cannot be instantised,
its methods can be used across multiple application
*/
class UtilityClassExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};

        // sort the array
        Arrays.sort(numbers);

        // print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // search for an element
        int index = Arrays.binarySearch(numbers, 7);

        // print the index of the element
        System.out.println("Index of 7: " + index);
    }
}
/*
        Method	        Description	                                                Syntax
        sort	        Sorts the elements of an array in ascending order	        Arrays.sort(array)
        binarySearch	Searches for a specific element in a sorted array	        Arrays.binarySearch(array, key)
        equals	        Compares two arrays for equality	                        Arrays.equals(array1, array2)
        fill	        Fills an array with a specific value	                    Arrays.fill(array, value)
        copyOf	        Copies an array to a new array with a specified length	    Arrays.copyOf(array, newLength)
        asList	        Converts an array to a List	                                Arrays.asList(array)
        Many more ...
        https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
 */