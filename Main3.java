package org.example;

public class Main3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello"; 
        String s3 = new String("Hello"); 
        String s4 = new String("Hello"); 

        System.out.println(s1==s2);
        System.out.println(s3.equals(s4));

        System.out.println("s1 hash: " + System.identityHashCode(s1)); 
        System.out.println("s2 hash: " + System.identityHashCode(s2));
        System.out.println("s3 hash: " + System.identityHashCode(s3));
        System.out.println("s4 hash: " + System.identityHashCode(s4));

        String Pool:
┌─────────────────┐
│ "Hello" object  │ ← BOTH s1 and s2 point to this SAME object
└─────────────────┘
     ↑       ↑
        s1      s2
    }

}



