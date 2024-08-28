import java.util.Random;
import java.util.Scanner;

public class SwitchStructure {
    public static void main(String[] args) {
//        System.out.println(sumPoint());
//        guessNum();
//        printX();
//        outEveNum();
//        mockLogin();
        binarySequence();
//        gcd();
    }



//    计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static double sumPoint(){
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/i * flg;
            flg = -flg;
        }
        return sum;
    }

//    猜数字游戏
    public static void guessNum() {
        Random random = new Random();
        //生成[0,100)随机数
        int randNum = random.nextInt(100);
        System.out.println("请输入你猜的数字：");
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        while (true) {
            if (myNum > randNum) {
                System.out.println("猜大了");
            } else if (myNum < randNum) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜中了");
                break;
            }
            myNum = scanner.nextInt();
        }
    }

    //    打印X图形
    public static void printX() {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//    输出每一位
    public static void outEveNum() {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        while (myNum != 0) {
            System.out.print(myNum % 10);
            System.out.print(" ");
            myNum /= 10;
        }
    }

//    模拟登陆
    public static void mockLogin() {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            if (count == 3) {
                System.out.println("请输入密码");
            } else {
                System.out.println("请输入密码，你还有" + count + "次机会");
            }
            String password = scanner.nextLine();
            if (password.equals("abcdefg")) {
                System.out.println("登陆成功");
                break;
            }else {
                count--;
            }
        }
        if (count == 0) {
            System.out.println("退出程序");
        }
    }

//    二进制序列
    public static void binarySequence() {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        //偶数位
        System.out.print("偶数位：");
        for (int i = 31; i >= 0 ; i -= 2) {
            System.out.print(((myNum >> i)&1)+" ");
        }
        System.out.println();
        System.out.print("奇数位：");
        //奇数位
        for (int i = 30; i >= 0 ; i -= 2) {
            System.out.print(((myNum >> i)&1)+" ");
        }
    }
//    最大公约数
    public static void gcd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3;
        if (num1 > num2) {
            num3 = num1;
        }else {
            num3 = num2;
        }
        for (int i = num3/2; i > 0; i--) {
            if (num1%i == 0 && num2%i == 0) {
                System.out.println("最大公约数是："+i);
                break;
            }
        }
    }
}
