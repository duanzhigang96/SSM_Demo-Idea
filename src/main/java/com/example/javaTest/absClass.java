package com.example.javaTest;

public abstract class absClass {
    public void onStart() {
        System.out.println("onStart as abstrace");
    }

    public abstract void onSuccess();

    public void onFailure() {
        System.out.println("onFailure");
    }

}
