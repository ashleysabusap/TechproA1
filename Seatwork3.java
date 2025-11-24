// Parent Class
class Animal {
    private String name;
    private int age;

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    void sound() {
        System.out.println("Some generic animal sound");
    }

    void sound(int times) {
        for (int i = 0; i < times; i++) {
            sound();
        }
    }
}

// Dog Class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark bark!");
    }
}

// Cat Class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow meow!");
    }
}

// Cow Class
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo moo!");
    }
}

public class Seatwork3 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(3);

        Cat cat = new Cat();
        cat.setName("Kitty");
        cat.setAge(2);

        Cow cow = new Cow();
        cow.setName("Bessie");
        cow.setAge(5);

        System.out.println(dog.getName() + " says:");
        dog.sound();
        dog.sound(3);

        System.out.println(cat.getName() + " says:");
        cat.sound();
        cat.sound(2);

        System.out.println(cow.getName() + " says:");
        cow.sound();
        cow.sound(4);
    }
}