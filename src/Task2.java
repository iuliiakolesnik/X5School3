import java.util.*;

public class Task2 {

    static class Animal {
        private String food;
        private String location;

        public String getFood() {
            return this.food;
        }

        public String getLocation() {
            return this.location;
        }

        public void setFood(String food) {
            this.food = food;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        void makeNoise() {
            System.out.println("Такое-то животное шумит");
        }

        void eat() {
            System.out.println("Такое-то животное ест");
        }

        void sleep() {
            System.out.println("Такое-то животное спит");
        }

        Animal() {
        }

        Animal(String food, String location) {
            this.food = food;
            this.location = location;
        }

    }

    static class Dog extends Animal {
        private String breed;

        public String getBreed() {
            return this.breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        void makeNoise() {
            System.out.println("Собака шумит");
        }

        void eat() {
            System.out.println("Собака ест");
        }

        Dog(String food, String location, String breed) {
            super(food, location);
            this.breed = breed;
        }
    }

    static class Cat extends Animal {
        private String color;

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        void makeNoise() {
            System.out.println("Кошка шумит");
        }

        void eat() {
            System.out.println("Кошка ест");
        }

        Cat(String food, String location, String color) {
            super(food, location);
            this.color = color;
        }
    }

    static class Horse extends Animal {
        private int win;

        public int getWin() {
            return this.win;
        }

        public void setWin(int win) {
            this.win = win;
        }

        void makeNoise() {
            System.out.println("Лошадь шумит");
        }

        void eat() {
            System.out.println("Лошадь ест");
        }

        Horse(String food, String location, int win) {
            super(food, location);
            this.win = win;
        }
    }


    static class Doctor {
        void threadAnimal(Animal animal) {
            System.out.println("Food: " + animal.getFood() + " Location: " + animal.getLocation());
        }
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();

        ArrayList<Animal> animals = new ArrayList<Animal>();

        Animal dog = new Dog("мясо", "Тольятти", "Корги");
        Cat cat = new Cat("молоко", "Москва", "Голубая");
        Horse horse = new Horse("овес", "Самара", 5);
        Animal animal = new Animal("капуста", "Екатеринбург");

        animals.add(dog);
        animals.add(cat);
        animals.add(horse);
        animals.add(animal);

        for (Animal i : animals) {
            doctor.threadAnimal(i);
            i.makeNoise();
            i.eat();
            i.sleep();
        }
    }
}
