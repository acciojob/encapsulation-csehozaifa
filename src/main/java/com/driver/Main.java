package com.driver;

public class Main {
// Main.java
        public static void main(String[] args) {
            RWOnly obj = new RWOnly();

            // Step 4: Try setting a value to name directly (will result in an error)
            // Uncommenting the following line will result in a compilation error
            // obj.name = "John";

            // Try printing it (will also result in an error)
            // Uncommenting the following line will result in a compilation error
            // System.out.println(obj.name);

            // Step 6: Set a value to name using setter function
            obj.setName("John");

            // Access its value using getter function
            System.out.println(obj.getName()); // Output: John
        }
    }

  
