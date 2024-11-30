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

    public void addAttraction(String name, String openingHours, int price) {
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
        int price;

        public Attraction(String name, String openingHours, int price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Название атракциона:" + name);
            System.out.println("Время работы:" + openingHours);
            System.out.println("Стоимость:" + price + "р");
            System.out.println();
        }
    }

}







