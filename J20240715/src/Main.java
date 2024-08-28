import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        print(x);
//        System.out.println(sumN(x));

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = x;
            x = sc.nextInt();
        }


        for(int y: array1){
            System.out.print(y);
            System.out.print(" ");
        }


        System.out.println(array1.length);

    }

    public static void print(int n){
        if (n < 10) {
            System.out.println(n);
            return;
        }
        print(n / 10);
        System.out.println(n % 10);
    }

    public static int sumN(int n){
        if (n == 1) {
            return 1;
        }
        int tmp = n + sumN(n - 1);
        return tmp;
    }
}
