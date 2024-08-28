package demo3;


interface IShape {
    void draw();
}

class Rect implements IShape {
    @java.lang.Override
    public void draw() {
        System.out.println("画矩形");
    }
}

class Cycle implements IShape {
    @java.lang.Override
    public void draw() {
        System.out.println("画圆");
    }
}

class Flower implements IShape {
    @java.lang.Override
    public void draw() {
        System.out.println("❀");
    }
}

public class TestDemo {
    public static void drawMap(IShape iShape) {
        iShape.draw();
    }

    public static void main(String[] args) {
        drawMap(new Rect());
        drawMap(new Cycle());
        drawMap(new Flower());
    }
}
