package 顺序表;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);//默认放到数组最后一个位置
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(new Integer(1));
        list.set(0, 78);
        System.out.println(list);

        System.out.println("============================");

        //使用迭代器遍历list
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        ListIterator<Integer> it1 = list.listIterator(list.size());
        while (it1.hasPrevious()) {
            System.out.print(it1.previous() + " ");
        }
        System.out.println();

        System.out.println(a());
    }
    public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(10);
        myArrayList.add(25);
        myArrayList.add(78);
        myArrayList.add(2);
        myArrayList.display();
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(4));
        myArrayList.set(2, 999);
        myArrayList.display();
        myArrayList.remove(999);
        myArrayList.remove(1);
        myArrayList.remove(2);
        myArrayList.remove(879);
        myArrayList.display();
//        myArrayList.clear();
    }

    public static String a(){
        return "abc";
    }
}
