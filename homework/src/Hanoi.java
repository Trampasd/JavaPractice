public class Hanoi {
    public static void main(String[] args) {
        myHanio(1, 'A', 'B', 'C');
        System.out.println();
        myHanio(2, 'A', 'B', 'C');
        System.out.println();
        myHanio(3, 'A', 'B', 'C');
        System.out.println();
        myHanio(4, 'A', 'B', 'C');
        System.out.println();
    }

    public static void move(char a, char b) {
        System.out.print(a+"->"+b+" ");
    }

    //四个参数，盘子个数，源柱子，辅助柱子，目标柱子
    public static void myHanio(int n, char a, char b, char c){
        if (n == 1) {
            move(a, c);
        }
        else {
            //先把除最大的盘子之外的盘子从A柱子借助C柱子移动到B柱子
            myHanio(n-1, a, c, b);
            //然后把最大的盘子从A移动到C
            move(a, c);
            //然后把剩下n-1个盘子从B借助A移动到C
            myHanio(n-1, b, a, c);
        }
    }
}
