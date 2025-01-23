
package com.exceptions;

public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("com.exceptions.exce");
            ClassLoader.getSystemClassLoader().loadClass("com.exceptions.exce");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}