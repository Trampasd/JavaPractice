public class Test {
    public static void main(String[] args){
        int x = 50;
        int y = 10;
        int z = 5;
//        System.out.println(max2(x, y));
//        System.out.println(max3(x, y, z));
        System.out.println(factorial(z));
//        System.out.println(facSum(10));
//        int n = 50;
//        for (int i = 1; i <= n ; i++) {
//            System.out.println(fibonacci(i));
//        }

//        System.out.println(fibonacci(3));
//        System.out.println(sum(4.5, 5.6));
//        System.out.println(sum(3, 4));
//        System.out.println(max(x, y));
//        System.out.println(max(x, y, z));
    }

    public static int max2(int a, int b){
        return a > b || a == b ? a:b;
    }

    public static int max3(int a, int b, int c){
        int max = max2(a, b);
        return max > c || max == c ? max : c;
    }

    public static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int facSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }

    public static long fibonacci(int n){
        if (n == 1 || n == 2) {
            return 1;
        }else {
            long cur = 0;
            long near1 = 1;
            long near2 = 1;
            for (int i = 3; i <= n; i++) {
                cur = near1 + near2;
                near1 = near2;
                near2 = cur;
            }
            return cur;
        }
    }

    public static int sum(int x, int y){
        return x + y;
    }

    public static double sum(double x, double y){
        return x + y;
    }

    public static int max(int a, int b){
        return a > b || a == b ? a : b;
    }

    public static int max(int a, int b, int c){
        int max = max(a, b);
        return max > c || max == c ? max : c;
    }

    public static void move(char pos1, char pos2){
        System.out.println(pos1 + "->" + pos2);
    }
    public static void hanoi(int n, char pos1, char pos2, char pos3){

    }
}
