
package com.methodOverloading;

public class MethodOverloading {
    int num1;
    int num2;
    int rollNo;
    String name;


    void method1(int num1) {
        this.num1 = num1;
        System.out.println("1.First number : " + num1);
    }

    void method1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("1.Sum of two numbers : " + (num1 + num2));
    }
    void method2(int rollNo) {
        this.rollNo = rollNo;  //Integer
        System.out.println("2.Roll number : " + rollNo);
    }
    //same method name two parameters
    void method2(int rollNo, String name) {
        this.rollNo = rollNo; //Integer
        this.name = name;     //String
        System.out.println("2.Roll number : " + rollNo + " ; " + "Name : " + name);
    }


    void method4(int rollNo) {
        this.rollNo = rollNo;  //Integer data type
        System.out.println("4.Roll number : " + rollNo);
    }
    //same method name different parameter type
    void method4(String name) {
        this.name = name;   //String
        System.out.println("4.Name : " + name);
    }

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();
        // 01.Calling the methods from main method
        mo.method1(11);
        mo.method1(10, 20);

        // 02.Calling the methods from main method
        mo.method2(317);
        mo.method2(317, "Sharan");

        // 03.Calling the methods from main method
        mo.method4(317);
        mo.method4("Sharan");
    }

}