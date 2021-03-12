package PRACTICAL;


public class Hotel {
    public String hotelName;
    public String ownerName;
    public String location;

    public Hotel(String hotelName,String ownerName,String location){
        this.hotelName = hotelName;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString(){
        return "Hotel{" +
                "name='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
