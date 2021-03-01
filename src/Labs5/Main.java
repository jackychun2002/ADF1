package Labs5;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Tat Tay Xiu");
        p1.setSex("Nam");
        p1.setDate("30/11/2002");
        p1.setAddress("Ha Noi");
        p1.print();

        Student s1= new Student();
        s1.setName("Tat Tay Tai");
        s1.setAddress("Ha Noi");
        s1.setSex("Nu");
        s1.setDate("25/10/2002");
        s1.setId(1);
        s1.setDiem(9);
        s1.setEmail("chiendtth2006016@gmail.com");
        s1.print();
    }
}
