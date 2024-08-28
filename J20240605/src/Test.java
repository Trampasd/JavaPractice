import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println(5/2);
        System.out.println((float)5/2);
        System.out.println(5/(float)2);
        System.out.println((float)(5/2));
        System.out.println("==============");
        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);
        System.out.println(10.5 % 3);
        //System.out.println(10/0);
        int c = 100;
        long a = 10;
//        c = c + a;
        c += a;
        System.out.println(c);

        System.out.println(a>5);

        a = 1;
        System.out.println(~a);
    }
}
