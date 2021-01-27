package com.company;

public class Student {
    int id;
    String name;
    int age;

    void run(){
        System.out.println(name+" Running...");
    }

    void eat(){
        System.out.println(this.name+" Eating..");
    }
}
