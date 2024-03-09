package com.driver;

public class Main {

    public static class A {

        public static String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {

        public static String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void Main(String[] arg) {
        A b = new A();
        System.out.println(b.meth());

        B a = new B();
        System.out.println(a.meth());

    }
}