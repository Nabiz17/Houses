public class ApartmentHouse extends House{

  private int numberOfTrips;
  //Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
  //При создании многоквартирного дома дополнительно принимайте
  // в конструкторе целое число - количество подъездов.
  public ApartmentHouse(String address) {
    super(address);
    this.numberOfTrips = numberOfTrips;
  }

  //В методе toString() выводите в удобном виде всю известную информацию о доме.

  @Override
  public String toString() {
    return "Многоквартирный дом по адресу " + address + "из" + numberOfTrips + "подъездов";
  }
}
