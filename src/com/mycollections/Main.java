/**
 *  Java program to create and add different values to Hashtable.
 */

package com.mycollections;

import java.util.Hashtable;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Hashtable myTable = new Hashtable<>();

        // Add.
        myTable.put(2, "Socks");
        myTable.put(3.1, 1000);
        myTable.put(9L, 'J');
        myTable.put(Byte.valueOf("8"), "U");

        // Print.
        System.out.println(myTable); // Output: {3.1=1000, 9=J, 8=U, 2=Socks}

        // Clear.
        myTable.clear();

    }
}