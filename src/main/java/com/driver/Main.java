package com.driver;

public class Main {

    public static class A {

        public static String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        
        public static String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void Main(String[] arg) {
        B b = new B();
        b.meth();

        B a = new B();
        a.meth();

    }
}