package Asiment1;

public class Tamgiac {
    int a;
    int b;
    int c;
    double Cv;
    double P;
    double S;

    void run(){
        System.out.println("Cạnh thứ nhất: "+ a +
                            "\n" + "Cạnh thứ hai: "+ b +
                            "\n" + "Cạnh thứ ba: " + c + "\n");
    }
    void ChangerA(int n){a = n;}
    void ChangerB(int n2){b = n2;}
    void ChangerC(int n3){c = n3;}

    boolean checkTriangle(){
        if( a+b>c && b+c>a && c+a>b){
            Cv = a + b +c;
            P = Cv/2;
            S = Math.sqrt(P * ( P- a) * ( P- b) * ( P- c));
            return true;
        }
            return false;
    }
}
