package Labs5;

public class Person {
    public String name;
    public String sex;
    public String date;
    public String address;

    public Person(){
    }

    public Person(String name,String sex,String date,String address){
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
     public String getSex (){
        return sex;
     }
     public void setSex(String sex){
        this.sex=sex;
     }
     public String getDate (){
        return date;
     }
     public void setDate(String date){
        this.date=date;
     }

     public String getAddress(){
        return address;
     }
     public void setAddress(String address){
        this.address = address;
     }

     public void print(){
         System.out.println("Ho Va Ten:" + this.getName());
         System.out.println("Gioi Tinh:" + this.getSex());
         System.out.println("Ngay Sinh:" + this.getDate());
         System.out.println("Dia chi:" + this.getAddress());
     }

}
