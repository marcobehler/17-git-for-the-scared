package com.marcobehler;

import org.apache.commons.lang.RandomStringUtils;

import java.io.File;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class Kitten {

    public void snuggle() {
        System.out.println("i want to snuggle with you...");
    }

    public void meow() {
        System.out.println("Meeooooww" + RandomStringUtils.randomAlphabetic(20));
    }

public void test() {
	System.out.println("This is some test....");
}


    public void joho() {
        File v = new File("jo");
        System.out.println(v);
    }

    public void blah() {
        System.out.println("blah!");
        System.out.println("even more blah!");
    }

    public void hopOnKeyboard() {
        System.out.println("hopping on your keyboard..");
    }
}
