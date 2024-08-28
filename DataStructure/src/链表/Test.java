package 链表;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(45);
        myLinkedList.addLast(12);
        myLinkedList.addLast(78);

        myLinkedList.display();
        System.out.println(myLinkedList.contains(13));
    }
    public static void main1(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
    }

    public static int getCM(int m, int n){

        //write your code here......
        int max = Math.max(m, n);

        for (int i = max; ; i++) {
            if (max % m == 0 && max % n == 0){
                break;
            }
            max++;
        }

        return max;
    }
}
