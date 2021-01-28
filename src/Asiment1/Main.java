package Asiment1;

public class Main {
    public static void main(String[]args){
        Tamgiac tg= new Tamgiac();

        tg.ChangerA(3);
        tg.ChangerB(4);
        tg.ChangerC(5);

        if (tg.checkTriangle()){
            System.out.println("Là 3 cạnh của tam giác \n");
            System.out.println("Chu vi của tam giác: " +tg.Cv);
            System.out.println("\n Diện tích của tam giác:"+tg.S);
        }else {
            System.out.println("không phải 3 cạnh của tam giác");
        }
    }
}
