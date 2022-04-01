package com.max.natifepatterns.singleton;

public class SingletonJava
{
    private static SingletonJava instance;
    public String value;

    private SingletonJava(String value){
        this.value = value;
    }

    public static SingletonJava getInstance(String value){
        if (instance == null) instance = new SingletonJava(value);
        return  instance;
    }
}
