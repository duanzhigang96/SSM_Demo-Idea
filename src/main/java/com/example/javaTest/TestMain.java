package com.example.javaTest;

public class TestMain {
    public static void main(String[] args) {

        People people = new People();
        People people1 = new People();
        people.showMessage();
        people1.showMessage();
        System.out.println("----分---割---线-----");
        Single single = Single.getInstance();
        Single single1 = Single.getInstance();
        single1.showMessage();
        single.showMessage();
    }
}
