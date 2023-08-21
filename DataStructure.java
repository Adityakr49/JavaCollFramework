package DataStructure;

public class DataStructure {
    /*
Java provides a wide range of data structures that are used
for storing and manipulating data in programs. Some of the
most commonly used data structures in Java include:
1.Arrays
2.ArrayList
3.LinkedList
4.HashSet
5.TreeSet
6.HashMap
7.TreeMap
8.Queue
9.Stack
10.PriorityQueue

In addition to these data structures, Java also provides several interfaces,
such as List, Set, and Map, that can be implemented using different data structures.
These interfaces define common methods that can be used to add, remove, and access elements
in a collection, regardless of the underlying data structure used to implement them.
*/
    /*
Algorithm	            Best-case   	Average-case 	Worst-case	Space complexity
Arrays.sort()	        O(n log n)	    O(n log n)	    O(n^2)	                        O(log n)
Collections.sort()	    O(n log n)	    O(n log n)	    O(n^2)	                        O(log n)
List.sort() (Java 8+)	O(n log n)	    O(n log n)	    O(n log n)	                    O(log n)
PriorityQueue	        O(n log n)	    O(n log n)	    O(n log n)	                    O(n)
LinkedList.sort() (Java 8+)	O(n)	    O(n log n)	    O(n^2)	                        O(1)
Merge sort	            O(n log n)	    O(n log n)	    O(n log n)	                    O(n)
Quick sort	            O(n log n)	    O(n log n)	    O(n^2)	                        O(log n)
Heap sort	            O(n log n)	    O(n log n)	    O(n log n)	                    O(1)
Radix sort	            O(nk)	        O(nk)	        O(nk)	                        O(n + k)
Bucket sort	            O(n+k)	        O(n+k)	        O(n^2)	                        O(n + k)
Counting sort	        O(n+k)	        O(n+k)	        O(n+k)	                        O(k)
Bubble sort	            O(n)	        O(n^2)	        O(n^2)	                        O(1)
Cocktail sort	        O(n)	        O(n^2)	        O(n^2)	                        O(1)
Comb sort	            O(n log n)	    O(n^2)	        O(n^2)	                        O(1)
Gnome sort	            O(n^2)	        O(n^2)	        O(n^2)	                        O(1)
Insertion sort	        O(n)	        O(n^2)	        O(n^2)	                        O(1)
Selection sort	        O(n^2)          O(n^2)	        O(n^2)	                        O(1)
Shell sort	            O(n log n)	    O(n log^2 n)	O(n log^2 n)	                O(1)
     */
    /*
Algorithm	        Best Case	    Average Case	Worst Case	    Space Complexity	Class	            Uses
Insertion Sort	    Ω(n)	        Θ(n^2)	        O(n^2)	        O(1)	            Comparison sort	    Efficient for small arrays, or partially sorted arrays
Selection Sort	    Ω(n^2)	        Θ(n^2)	        O(n^2)	        O(1)	            Comparison sort	    Simple, but inefficient sorting algorithm
Bubble Sort	        Ω(n)	        Θ(n^2)	        O(n^2)	        O(1)	            Comparison sort	    Simple, but inefficient sorting algorithm
Merge Sort	        Ω(n log(n))	    Θ(n log(n))	    O(n log(n))	    O(n)	            Comparison sort	    General purpose sorting algorithm
Quick Sort	        Ω(n log(n)) 	Θ(n log(n))	    O(n^2)	        O(log(n))	        Comparison sort	    General purpose sorting algorithm
Heap Sort	        Ω(n log(n))	    Θ(n log(n))	    O(n log(n))	    O(1)	            Comparison sort	    General purpose sorting algorithm
Tim Sort	        Ω(n)	        Θ(n log(n))	    O(n log(n))	    O(n)	            Comparison sort	    Optimized for sorting real-world data
Dual-Pivot Quick Sort Ω(n log(n))	Θ(n log(n))	    O(n log(n)) 	O(log(n))	        Comparison sort	    Optimized version of Quick Sort
Arrays.sort()	    Ω(n log(n))	    Θ(n log(n))	    O(n log(n))	    O(log(n))	        Comparison sort	    Sorting arrays of primitives or objects
Collections.sort()	Ω(n log(n))	    Θ(n log(n))	    O(n^2)	        O(log(n))	        Comparison sort	    Sorting List objects with natural or custom ordering
ParallelSort	    Ω(n log(n))	    Θ(n log(n))	    O(n log(n)) 	O(log(n))	        Comparison sort	    Parallel version of Arrays.sort() for large arrays
PriorityQueue	    Ω(n)	        Θ(n log(n))	    O(n log(n))	    O(n)	            Priority queue	    Sorts elements in ascending order of priority
TreeMap	            Ω(n log(n))	    Θ(n log(n))	    O(n log(n))	    O(n)	            Red-black tree	    Sorts key-value pairs based on the keys
TreeSet	            Ω(n log(n))	    Θ(n log(n))	    O(n log(n))	    O(n)	            Red-black tree	    Sorts unique elements in natural or custom ordering
Arrays.parallelSort() Ω(n log(n))	Θ(n log(n))	    O(n log(n))	    O(log(n))	        Comparison sort	    Parallel

     */
}
