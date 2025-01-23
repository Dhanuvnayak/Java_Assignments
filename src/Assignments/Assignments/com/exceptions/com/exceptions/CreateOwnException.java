
package com.exceptions;

class InvalidExamException extends Exception {
    InvalidExamException(String msg) {
        System.out.println(msg);
    }
}

//creating our own exception
public class CreateOwnException {

    //creating a method which receives integer as parameter
    static void exam(int marks) throws InvalidExamException {
        // throws exception if marks are less than 40
        if (marks < 40) {
            //InvalidExamException is our own custom exception
            throw new InvalidExamException("Failed in exam");
        } else {
            System.out.println("Passed in exam");
        }
    }

    public static void main(String[] args) {
        try {
            //passing marks to the method
            exam(39);
        } catch (Exception i) {

            i.printStackTrace();
        }
    }
}