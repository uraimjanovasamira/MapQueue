import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Создайте класс Car (Id, номер авто).
        //Создайте еще один класс который хранит в себе данные машины (год выпуска, модель, цена, цвет).
        //Создайте HashMap ключ-машина,значение-данные машины.
        //Заполните HashMap и с помощью метода entrySet выведите на консоль все элементы.

        Map<Car, Data> map = new HashMap<>();

        map.put(new Car(78, 7890), new Data(2000,
                45670000, "BMW", "black"));

        map.put(new Car(5678, 12345), new Data(1890,
                90000000, "Mers", "red"));

        for (Map.Entry<Car, Data> i : map.entrySet()) {
            System.out.println(i.getKey() + ":" + i.getValue());
        }
    }
}