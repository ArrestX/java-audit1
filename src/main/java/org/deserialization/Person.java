package org.deserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Person implements Serializable {
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void action(String act){
        System.out.println("action方法");
    }
    private transient int age;
    private String name;
    private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        Runtime.getRuntime().exec("calc");
    }

}
