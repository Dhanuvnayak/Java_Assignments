
package com.exceptions;

public class ArithmeticExceptionTryCatch {

    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            System.out.println("Inside try block");
            //below code throws divide by zero exception
            c = a / b;
            System.out.println("c = " + c);
        }

        catch (java.lang.ArithmeticException e) {
            System.out.println("Handling the Arithmetic exception using try-catch block");
        }

        c = a / b;
        System.out.println("without exception handling");
    }
}