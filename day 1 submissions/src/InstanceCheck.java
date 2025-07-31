class Animal {

}

class Dog extends Animal {

}

public class InstanceCheck {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        if (d instanceof Dog) {
            System.out.println("d is an instance of Dog");
        }

        if (d instanceof Animal) {
            System.out.println("d is also an instance of Animal");
        }

        if (a instanceof Dog) {
            System.out.println("a is an instance of Dog");
        } else {
            System.out.println("a is NOT an instance of Dog");
        }
    }
}
