
class Cat {
    boolean hasFur;
    String color, breed;
    int legs, eyes;

    public void walk() {
        System.out.println("Cat is walking");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }
}

public class oops {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.eat();
    }
}

