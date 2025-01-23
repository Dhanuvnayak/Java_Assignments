
package com.collections;

import java.util.Iterator;
//Java HashSet class is used to create a collection that uses a hash table for storage.
public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> h2 = new java.util.HashSet<>();

        //a. adding elements to the HashSet using add() method
        h2.add("zero");
        h2.add("one");
        h2.add("two");
        h2.add("three");
        h2.add("four");
        h2.add("five");
        h2.add("six");
        h2.add("seven");
        h2.add("eight");
        h2.add("nine");
        h2.add("ten");
        //does not allow duplicate elements, Set contains unique elements only.
        h2.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        //HashSet doesn't maintain the insertion order
        System.out.println("jala = " + h2);


        //b. Iterating through the HashSet by using Iterator object
        Iterator<String> itr = h2.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(h2.clone());

        //c. Removing a specific element using remove() method
        h2.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("jala = " + h2);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(h2.isEmpty());


        //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(h2.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(h2.contains("one")); //returns boolean value

        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        h2.clear();
        System.out.println("jala = " + h2);
    }
}