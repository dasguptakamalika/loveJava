package org.example;

public class Main2 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Bruno";
        Dog d2 = d1;

        d2.name = "Whiskers";
        System.out.println(d2.name + " " + d1.name);
        System.out.println(d2.name==d1.name);
        System.out.println(d2.name.equals(d1.name));
    }
}
/*Dog d2 = d1; makes both variables point to the same object.
So changing d2.name changes the same Dog that d1 references →
both print “Whiskers”.*/