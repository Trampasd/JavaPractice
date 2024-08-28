public class Main {

    public static void Test(Animal animal) {
        animal.eat();
    }

    public static void Test1(IRunning iRunning) {
        iRunning.run();
    }

    public static void Test2(IFlying iFlying) {
        iFlying.fly();
    }

    public static void Test3(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("大黄", 1);
        Bird bird = new Bird("阿花", 2);

        Test(dog);
        Test(bird);

        System.out.println("===================");

        //实现了IRunning接口的类都可以作为形参传入
        Test1(dog);
        Test1(bird);

        System.out.println("===================");

        Test2(bird);

        System.out.println("===================");

        Test3(dog);

        System.out.println("===================");

        Test1(new Robot());
    }
}