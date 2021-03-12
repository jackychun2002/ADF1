package PRACTICAL;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Hotel[] hotel;
    public static void main(String [] args){
        hotel = new Hotel[10];

        Scanner Sc = new Scanner(System.in);
        System.out.println("Xin vui long nhap du lieu Khach San");
        for (int i=0;i<10;++i){
            System.out.println("Hotel " + (i + 1) + ":");
            System.out.print("name: ");
            String nameHotel = Sc.next();
            System.out.println("Vi tri:");
            String location = Sc.next();
            System.out.println("ownerName:");
            String ownerName = Sc.next();
            hotel[i] = new Hotel(nameHotel,location,ownerName);
        }
        System.out.println("Nhap ten chu so huu:");
        String ownerName = Sc.next();
    }
    public static void searchByOwnerName(String ownerName) {
        System.out.println("All hotels of " + ownerName + ":");
        for (Hotel hotel : hotel) {
            if (hotel.ownerName.equals(ownerName)) {
                System.out.println(hotel.toString());
            }
        }
    }
}
