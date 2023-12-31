package DataStructure;

import javax.swing.*;
import java.util.*;

public class MapStudy {
    public static void main(String[] args) {
        //Unordered
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Aditya");
        map.put("Roll", "One");
        map.put("Year", "Second");
        map.put("Pos", "one");
        //We can repeat the values but not keys as keys are set and values are List implementation
        System.out.println(map);

        //for HashMap with Integer,Integer
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        //Majority Element (>n/2) times

        
        Set<String> set = map.keySet();
        for (String key :
                set) {
            System.out.println(key + "   " + map.get(key));
        }


        //HashTable is  synchronized
        //Thread safe
        Map<String, String> map1 = new Hashtable<>();
        map1.put("Name", "Aditya");
        map1.put("Roll", "One");
        map1.put("Year", "Second");
        map1.put("Pos", "one");
        System.out.println(map1);


        //Real life example
        //Arranged
        Map<String, String> phonebook = new TreeMap<>();
        phonebook.put("Navin","9866772034");
        phonebook.put("Pooja","9388773241");
        phonebook.put("Ali","9287464137");
        phonebook.put("Mahesh","9954713654");
        phonebook.put("Archana","9874315640");
        System.out.println(phonebook.get("Pooja"));
        System.out.println(phonebook);


        //Original order maintained
        Map<String, String> pb = new LinkedHashMap<>();
        pb.put("Navin","9866772034");
        pb.put("Pooja","9388773241");
        pb.put("Ali","9287464137");
        pb.put("Mahesh","9954713654");
        pb.put("Archana","9874315640");
        System.out.println(pb);


        Set<Map.Entry<String,String>> values=pb.entrySet();
        for (Map.Entry<String,String> e:values)
        {
            System.out.println(e.getKey()+":"+e.getValue());
            e.setValue("III");
        }
    }
}
/*
HASHMAP                                         HASHTABLE
> Introduced in 1.2 version                     > There since Java was introduced
>It is not thread safe and unsynchronized       >It is thread safe and is synchronized
> It is fast                                    >It is Slow
>Works with single thread                       >Works with multiple threads
>Allows one null key                           >Does not allow null key
*/
/*
getOrDefault(Object key, V defaultValue):-This method returns value mapped with the specified key, otherwise default value is returned.
*/

/*
Method	                    Description
put(key, value)	            Adds a key-value pair to the hashmap.
get(key)	                Retrieves the value associated with a key.
containsKey(key)	        Checks if the hashmap contains a specific key.
containsValue(value)	    Checks if the hashmap contains a specific value.
remove(key)	                Removes a key-value pair based on the key.
size()	                    Returns the number of key-value pairs.
isEmpty()	                Checks if the hashmap is empty.
keySet()	                Returns a set of all keys in the hashmap.
values()	                Returns a collection of all values.
entrySet()	                Returns a set of all key-value pairs (entries).
*/
