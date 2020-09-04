import java.util.*;

public class Task2 {

    static class Animal
    {
        String food;
        String location;

        void makeNoise(){ System.out.println("Такое-то животное шумит");}
        void eat(){System.out.println("Такое-то животное ест");}
        void sleep(){System.out.println("Такое-то животное спит");}

        Animal(){}

        Animal (String food, String location)
        {
            this.food = food;
            this.location = location;
        }

    }

    static class Dog extends Animal
    {
        String breed;

        void makeNoise(){ System.out.println("Собака шумит");}
        void eat(){System.out.println("Собака ест");}
        void sleep(){System.out.println("Собака спит");}

        Dog (String food, String location, String breed)
        {
            super(food,location);
            this.breed = breed;
        }
    }

    static class Cat extends Animal
    {
        String color;

        void makeNoise(){ System.out.println("Кошка шумит");}
        void eat(){System.out.println("Кошка ест");}
        void sleep(){System.out.println("Кошка спит");}

        Cat (String food, String location, String color)
        {
            super(food, location);
            this.color = color;
        }
    }

    static class Horse extends Animal
    {
        int win;

        void makeNoise(){ System.out.println("Лошадь шумит");}
        void eat(){System.out.println("Лошадь ест");}
        void sleep(){System.out.println("Лошадь спит");}

        Horse (String food, String location, int win)
        {
            super(food, location);
            this.win = win;
        }
    }


    static class Doctor
    {
        void threadAnimal(Animal animal)
        {
            System.out.println("Food: " + animal.food + " Location: " + animal.location);
        }
    }

    public static void main(String[] args)
    {
        Doctor doctor = new Doctor();

        ArrayList<Animal> animals = new ArrayList<Animal>();

        Dog dog = new Dog("мясо", "Тольятти", "Корги");
        Cat cat = new Cat("молоко", "Москва", "Голубая");
        Horse horse = new Horse("овес", "Самара", 5);

        animals.add(dog);
        animals.add(cat);
        animals.add(horse);

        for (Animal i : animals)
        {
            doctor.threadAnimal(i);
        }

        dog.makeNoise();
        cat.eat();
        horse.sleep();
    }
}
