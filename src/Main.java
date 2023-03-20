import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    //В основном файле программы создайте список домов, в который поместите
    // два частных дома и один многоквартирный.

    List<House> houses = new ArrayList<>();

    House house1 = new Private_House( "Земля");
    houses.add(house1);

    House house2 = new Private_House( "Луна");
    houses.add(house2);

    House house3 = new ApartmentHouse("Марс", 7);
    houses.add(house3);

  }
}