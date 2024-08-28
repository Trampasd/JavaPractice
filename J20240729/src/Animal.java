public abstract class Animal {
    public String name;
    public int age;
    public abstract void eat();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
