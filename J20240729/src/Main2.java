
interface A{
    void testA();
}

interface B{
    void testB();
}

interface C extends A,B{
    void testC();
}

public class Main2 implements C{

    @Override
    public void testA() {
        System.out.println("A");
    }

    @Override
    public void testB() {
        System.out.println("B");
    }

    @Override
    public void testC() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.testA();
        main2.testB();
        main2.testC();
    }
}
