
package com.interfaces;
//interface
interface inter_7 {
    void methodOne();
}

//inherited interface
interface inter_07 extends inter_7 {
    void methodTwo();
}

class InheritedInterface implements inter_07 {
    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        //creating obj of InheritedInterface
        InheritedInterface if7 = new InheritedInterface();
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}