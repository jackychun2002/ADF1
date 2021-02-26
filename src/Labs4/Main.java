package Labs4;

public class Main {
    public static void main(String[] args){
        Account a = new Account(1,"A",50);
        Account b = new Account(1,"B",10);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B:" + b.getBalance());
        System.out.println();

        a.tranferTo(b,40);
        System.out.println("Balance A: "+ a.getBalance());
        System.out.println("Balance B:"+ b.getBalance());
        System.out.println();
    }
}
