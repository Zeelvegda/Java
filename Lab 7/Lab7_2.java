interface A {
    int CONSTANT_A = 10;
    void methodA();
}

interface A1 extends A {
    int CONSTANT_A1 = 20;
    void methodA1();
}

interface A2 extends A {
    int CONSTANT_A2 = 30;
    void methodA2();
}

interface A12 extends A1, A2 {
    void methodA12();
}

class B implements A12 {
    public void methodA() {
        System.out.println("Method A: " + CONSTANT_A);
    }

    public void methodA1() {
        System.out.println("Method A1: " + CONSTANT_A1);
    }

    public void methodA2() {
        System.out.println("Method A2: " + CONSTANT_A2);
    }

    public void methodA12() {
        System.out.println("Method A12");
    }
}

public class Lab7_2 {
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}