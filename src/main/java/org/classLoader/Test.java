package org.classLoader;

import java.io.IOException;

public class Test {
    static {
        try {
            Runtime.getRuntime().exec("open -a Calculator");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
