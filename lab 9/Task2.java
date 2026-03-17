class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Tweet!");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Animal d = new Dog("Buddy");
        Animal c = new Cat("Whiskers");
        Animal b = new Bird("Rio");

        d.sound();
        c.sound();
        b.sound();
    }
}