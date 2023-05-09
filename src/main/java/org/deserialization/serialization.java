package org.deserialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialization {
    public static void serialize(Object obj) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser.bin"));
        oos.writeObject(obj);
    }
    public static void main(String[] args) throws Exception {
        Person person = new Person(22,"22");
//        System.out.println(person);
        serialize(person);
    }
}
