package Asiment7;

public class SinhVien {
    int id;
    String name;
    int age;
    String address;
    float gpa;

    public SinhVien(int id,String name,int age,String address,float gpa){
        this.id = id;
        this.name = name;
        this.age= age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
