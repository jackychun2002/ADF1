package Labs5;

public class Student extends Person{
    public int id;
    public int diem;
    public String email;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public int getDiem(){
        return diem;
    }
    public void setDiem(int diem){
        this.diem=diem;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void print(){
        super.print();
        System.out.println("Id :"+ getId());
        System.out.println("Diem:"+ getDiem());
        System.out.println("email:"+ getEmail());
    }
    public boolean hocBong(){
        if (this.getDiem()>8.0){
            return true;
        }return false;
    }

}
