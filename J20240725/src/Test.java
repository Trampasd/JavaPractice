public class Test {
    public static void main(String[] args) {
        //向上转型，父类引用可以指向子类对象
        Animal animal1 = new Cat("咪咪", 12);
        animal1.eat();
        System.out.println("==========================");
        Animal animal2 = new Dog("汪疯", 12);
        animal2.eat();
        System.out.println("==========================");
        Animal animal = new Animal("动物", 12);
        animal.eat();
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "吃饭");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + "吃鱼~~~~");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + "吃骨头~~~~");
    }
}


