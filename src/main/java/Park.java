import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Park {
    String parkName;
    String address;
    List<Attraction> attractions;

    public Park(String parkName, String address) {
        this.parkName = parkName;
        this.address = address;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String openingHours, BigDecimal price) {
        attractions.add(new Attraction(name, openingHours, price));
    }

    public void display() {
        System.out.println("Название парка: " + parkName );
        System.out.println("Адрес:" + address );
        for (Attraction attraction : attractions) {
            attraction.displayInfo();
        }
    }


    public static class Attraction {
        String name;
        String openingHours;
        BigDecimal price;

        public Attraction(String name, String openingHours, BigDecimal price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Название атракциона:" + name);
            System.out.println("Время работы:" + openingHours);
            System.out.println("Стоимость:" + price);
            System.out.println();
        }

    }
    public static void main(String[] args){
        Park park=new Park("parkname","minsk");
        park.addAttraction("1","2",new BigDecimal(3));
        park.addAttraction("7","99",new BigDecimal(5));
        park.addAttraction("6","567",new BigDecimal(4));
        park.display();
    }


}







