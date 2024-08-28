package demo;

class Shape{
    public void draw() {
        System.out.println("画图形");
    }
}

class Rect extends Shape {
    @java.lang.Override
    public void draw() {
        System.out.println("画矩形");
    }
}

class Cycle extends Shape {
    @java.lang.Override
    public void draw() {
        System.out.println("画圆");
    }
}

class Flower extends Shape {
    @java.lang.Override
    public void draw() {
        System.out.println("❀");
    }
}


public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape rect = new Rect();
        Shape cycle = new Cycle();
        Shape flower = new Flower();

        drawMap(rect);
        drawMap(cycle);
        drawMap(flower);
    }
}
