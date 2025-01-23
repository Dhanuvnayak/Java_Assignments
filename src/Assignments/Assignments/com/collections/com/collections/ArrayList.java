
package com.collections;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList {

    public static void main(String[] args) {

        //passing an Array converted to List using the asList() method
        java.util.ArrayList<String> a1 = new java.util.ArrayList<>(
                Arrays.asList("zero", "one", "two", "three", "four", "five"));
        System.out.println(" = " + a1);

        //a. adding elements to the ArrayList using add method using add() method
        a1.add("six");
        a1.add("seven");
        a1.add("eight");
        a1.add("nine");
        System.out.println("\nAfter adding elements :");
        System.out.println("jala = " + a1);


        //b. Iterating through the ArrayList by using Iterator object
        Iterator<String> itr = a1.iterator();
        System.out.println("\nIterating through the ArrayList : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Adding an element at a specific index using add() method
        a1.add(1, "AtIndex1");
        System.out.println("\nAfter adding an element at index 1 :");
        System.out.println("jala = " + a1);

        //d. Removing an element at a specific index using remove() method
        a1.remove(1);
        System.out.println("\nAfter removing an element at index 1 :");
        System.out.println("jala = " + a1);

        //e. Updating the element at a specific index using set() method
        a1.set(1, "ONE");
        System.out.println("\nAfter updating the element at index 1 :");
        System.out.println("jala = " + a1);

        //f. Checking the element is present at a particular index using indexOf() method
        System.out.println("\nThe element is present at index :");
        System.out.println(a1.indexOf("three"));

        //g. Getting an element at a particular index using get() method
        System.out.println("\nThe element at index 3 :");
        System.out.println(a1.get(3));

        //h. Finding the size of the ArrayList using size() method
        System.out.println("\nSize of the ArrayList : ");
        System.out.println(a1.size());

        //i. Checking the element is present in the ArrayList using contains() method
        System.out.println("\n'two' is present in the ArrayList : ");
        System.out.println(a1.contains("two")); //returns boolean value

        //j. Removing all elements of the ArrayList using clear() method
        System.out.println("\nAfter removing all elements of the ArrayList :");
        a1.clear();
        System.out.println("jala = " + a1);
    }
}