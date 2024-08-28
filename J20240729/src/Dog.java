public class Dog extends Animal implements IRunning, ISwimming{

    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(name + "正在吃狗粮");
    }


    @Override
    public void run() {
        System.out.println(name + "正在用狗腿跑");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在狗刨");
    }
}
