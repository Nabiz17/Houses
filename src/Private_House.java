public class Private_House extends House {

  //Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".

  public Private_House(String address) {
    super(address);
  }

  //В методе toString() выводите в удобном виде всю известную информацию о доме.

@Override
  public String toString() {
    return "Частный оом по адресу " + address;
  }
}
