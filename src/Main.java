import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<House> houses = new ArrayList<>();

    House house1 = new Private_House( "Земля");
    houses.add(house1);

    House house2 = new Private_House( "Луна");
    houses.add(house2);

    House house3 = new ApartmentHouse("Марс");
    houses.add(house3);

    House house4 = new ApartmentHouse("Меркурий");
    houses.add(house4);

  }
}