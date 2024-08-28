import java.util.Random;
import java.util.Scanner;

public class CountNine {
    public static void main(String []args) {
//        countNine();
//        countFraction();
//        guessNumber();
//        printGraph();
        everyNum();
    }


    public static void countNine(){
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 9){
                count++;
            }else if(i / 10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void countFraction(){
        int flg = 1;
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/i*flg;
            flg = -flg;
        }
        System.out.println(sum);
    }

    public static void guessNumber(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int ran = random.nextInt(100);//[0,100)
        System.out.println("请输入你猜的数字");
        while (true){
            int num = sc.nextInt();
            if (num == ran){
                System.out.println("猜中了");
                break;
            } else if (num > ran) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
    }

    public static void printGraph() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要打印的行数：");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void everyNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = sc.nextInt();
        while(num != 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }
}
