package com.example.javaTest;

/**
 * 懒汉式,线程安全的单例模式
 */
public class Single {
    private static Single single = new Single();

    private Single() {
        System.out.println("我是单例模式的构造方法");
    }

    public static synchronized Single getInstance() {
        if (single == null) {
            single = new Single();
    }
        return single;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }
}
