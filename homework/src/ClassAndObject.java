public class ClassAndObject {
    public static void main(String[] args) {
        Test test = new Test(1 ,2);
        System.out.println(test.getX());
    }
}

class Test{

    private int a;
    Test() {
        this.a = 1;
    }

    Test(int a) {
        this.a = a;
        System.out.println("diao");
    }

    Test(int a, int b) {
        this(a);
        System.out.println("===============");
        this.a = b;
    }

    public int getX() {
        return this.a;
    }
    public static void hello(){
        System.out.println("hello");
    }
}
