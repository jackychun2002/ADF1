package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("hello world");
//        int x;
//        x = 10;
//        if(x>5){
//            System.out.println(x+"La so duobg");
//        }else {
//            System.out.println(x+"x <=  5");
//        }
//        for (int i = 0;i<10;i++){
//            System.out.println("i= "+i);
//        }
        Student st ;// khai bao 1 bien co kieu du lieu student
        st = new Student();
        Student st2 = new Student();
        st.name = "Nguyen Van An";
        st2.name = "Nguyen Van B";
        st.run();
        st2.run();
    }
}
