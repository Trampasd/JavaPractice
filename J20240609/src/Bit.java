import java.util.Random;
import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        guessNum();
    }

    public static void scanIn() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int num = sc.nextInt();//nextInt读入一个整数
        System.out.println("num:" + num);

        sc.nextLine();/*不加这个，上面的回车会保留至下面的读入，
                        使下面的读入直接结束，加此举可消除回车*/

        System.out.println("请输入内容name");
        String name = sc.nextLine();//nextLine只读一行
        System.out.println("name:" + name);

        System.out.println("请输入内容next");
        String next = sc.next();//next读到空格
        System.out.println("next:" + next);

        System.out.println("请输入一个小数");
        double salary = sc.nextDouble();//nextDouble读入一个小数，nextFloat同理
        System.out.println("salary:" + salary);

        sc.close();//打开后就要关闭
    }

    public static void circuLate() {
        Scanner sc = new Scanner(System.in);
        //循环读取数据,idea中用ctrl+d结束读取
        int sum = 0;
        while (sc.hasNextInt()) {//hasNextInt判断是否有下一个int值
            int num2 = sc.nextInt();
            sum += num2;
            System.out.println(num2);
        }
        sc.close();
    }

    public static void guessNum() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNum = random.nextInt(100);//[0,100)
        //50-100随机数 nextInt(50) + 50
        while (true) {
            System.out.println("请输入你要猜的数：");
            int num = scanner.nextInt();
            if (num == randNum) {
                System.out.println("猜对了");
                break;
            } else if (num > randNum) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
    }

}
