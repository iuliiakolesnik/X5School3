import java.awt.*;
import java.util.*;

public class Task1 {

    static class Phone {
        String model;
        String number;
        double weight;

        Phone() {
        }

        Phone(String model, String number) {
            this.model = model;
            this.number = number;
        }

        Phone(String model, String number, double weight) {
            this(model, number);
            this.weight = weight;
        }

        String getNumber() {
            return this.number;
        }

        void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        void receiveCall(String name, String number) {
            System.out.println("Звонит " + name + " Номер: " + number);
        }

        void senMessage(String number, String... arg) {
            System.out.println(number);
            for (String i : arg) {
                System.out.println(i);
            }
        }

        void print() {
            System.out.println("Model: " + this.model + " Number: " + this.number + " Weight: " + this.weight);
        }
    }


    public static void main(String args[]) {
        Phone phone1 = new Phone("Samsung", "+7(987)977-07-37", 10.8);
        Phone phone2 = new Phone("Honor", "+7(903)215-39-93", 15.8);
        Phone phone3 = new Phone("Apple", "+7(927)781-67-86", 9.8);

        phone1.print();
        phone2.print();
        phone3.print();

        phone1.receiveCall("Tom");
        phone2.receiveCall("Jane");
        phone3.receiveCall("John");

        phone1.receiveCall("Tom", phone2.getNumber());
        phone2.receiveCall("Jane", phone3.getNumber());
        phone3.receiveCall("John", phone1.getNumber());

        phone1.senMessage(phone2.getNumber(), phone3.getNumber(), phone1.getNumber(), "+7(927)781-66-68");

    }
}
