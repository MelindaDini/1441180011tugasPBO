package Percobaan;

/**
 * Created by Toshiba C640 on 11-Jun-15.
 */
public class TestClass {
    public static void main(String[] args) {
        charger toshiba = new charger("1m","240v",10,"langsung");
        charger hp = new charger("1,5m","100v",5,"terminal");
        charger asus = new charger("1,5m","115v",15,"terminal");
        charger dell = new charger("2m","200v",20,"langsung");

       laptop acer = new laptop("hitam","acer",14,"tanam",hp);
        System.out.println(acer.toString());
    }
}
