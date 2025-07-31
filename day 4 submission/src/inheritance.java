class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B {
    void showB() {
        System.out.println("Class B");
    }
}

class C extends A, B {
    void showC() {
        System.out.println("Class C");
    }
}

public class inheritance{
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
