

class Cat {
    boolean hasFur;
    String color, breed;
    int legs, eyes;
    String name="Cat";
    public void walk() {
        System.out.println(name+" is walking.");
    }

    public void eat() {
        System.out.println(name+" is eating.");
    }
}

class Dog {
    
    String name = "Dog", breed;

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void eat() {
        System.out.println(name + " is eating food");
    }
}
public class oops {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Bun";
        cat1.eat();
        cat1.walk();
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        
    }
}

