package bag2;

import bag1.TestDemo1;

class TestDemo2 extends TestDemo1 {
    public int x;
    public int y;
    public void print() {
        TestDemo2 testDemo2 = new TestDemo2();
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        TestDemo2 testDemo2 = new TestDemo2();
        testDemo2.print();
    }
}
