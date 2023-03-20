public abstract class House {
  //Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.
  //
  //Напишите для адреса сеттер и геттер.

  //В методе toString() выводите в удобном виде всю известную информацию о доме.
  //
  //В основном файле программы создайте список домов, в который поместите
  // два частных дома и один многоквартирный.
  //
  //Выведите информацию о домах в списке с использованием цикла for-each.
  protected String address;

  public House(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
@Override
  public String toString() {
    return "Дом по адресу " + address;
  }
}
