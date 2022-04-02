package com.max.natifepatterns.singleton;

public class SingletonJava {

    private volatile static SingletonJava INSTANCE;
    public String value;

    private SingletonJava() {
    }

    public static SingletonJava getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonJava.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonJava();
                }
            }
        }
        return INSTANCE;
    }
}
