package org.example;

import java.io.InputStream;
import java.nio.Buffer;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        String result = new App().load(args[0]);
        System.out.println(result);
    }

    public String load(String arg) throws Exception {
        try(InputStream in = App.class.getResourceAsStream(arg)) {
            return new String(in.readAllBytes());
        }
    }
}
