package demo2;

abstract class Shape{
    public abstract void draw();
}


class A extends Shape{
    @java.lang.Override
    public void draw() {
        System.out.println("这是A");
    }
}

class B extends Shape{
    @java.lang.Override
    public void draw() {
        System.out.println("这是B");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new A();
        Shape shape2 = new B();
        method(shape1);
        method(shape2);
    }

    public static void method(Shape shape) {
        shape.draw();
    }
}

