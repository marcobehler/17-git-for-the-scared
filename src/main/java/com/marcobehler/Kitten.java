package com.marcobehler;

import org.apache.commons.lang.RandomStringUtils;

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

    public void freakOut() {
        System.out.println("i am freaking out right now!!!");
    }

    // this is a comment

    public void blah() {
        System.out.println("blah!");
        System.out.println("even more blah!");
    }

    public void hopOnKeyboard() {
        System.out.println("hopping on your keyboard..");
    }

    public static void main(String[] args) {
        System.out.println("this is a bugfix");
    }

    public void feature2() {
        System.out.println("todo");
    }

    public void feature3() {
        System.out.println("todo ");
    }

    public void bugfix(String todo) {
        System.out.println("todo");
    }
}
