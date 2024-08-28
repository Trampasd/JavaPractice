public class Bird extends Animal implements IFlying, IRunning{
    @Override
    public void eat() {
        System.out.println(name + "正在吃鸟粮");
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(name + "正在用翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(name + "正在用鸟腿跑");
    }
}
