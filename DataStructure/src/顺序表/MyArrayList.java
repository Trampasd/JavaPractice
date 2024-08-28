package 顺序表;

import java.util.Arrays;

public class MyArrayList {
    private int[] elem;//存放数据元素
    private int usedSize;//代表当前顺序表中有效数据的个数

    private static final int DEFAULT_SIZE = 10;

    //默认构造
    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
    }

    //指定容量
    public MyArrayList(int initcapacity) {
        this.elem = new int[initcapacity];
    }

    public boolean isFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        //考虑数组满了的情况
        if (isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem, this.elem.length*2);
        }
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    // 在 pos 位置新增元素
    //逻辑是将pos及其后面的元素移动位置，将pos位置空出来放置新元素
    //移动时要注意应该从后面开始挪
    public void add(int pos, int data) {
        //检查位置是否合法
        if (pos < 0 || pos > this.usedSize) {
            //运用异常的思想，创建一个异常类PosOutOfBoundsException，设置为运行时异常
            throw new PosOutOfBoundsException(pos + " 位置不合法!");
//            System.out.println("位置不合法！");
//            return;
        }


        //考虑数组满了的情况
        if (isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem, this.elem.length*2);
        }

        for (int i = this.usedSize-1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }

        this.elem[pos] = data;
        this.usedSize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new PosOutOfBoundsException(pos + " 位置不合法！");
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void set(int pos, int value) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new PosOutOfBoundsException(pos + " 位置不合法！");
        }

        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = indexOf(toRemove);
        if (index == -1) {
            System.out.println("没有这个元素！");
            return;
        }

        //防止越界设置   i < this.usedSize-1
        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }

        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        // 若数组是引用类型则需要每个元素都置null，防止内存泄漏
        // 此处是int类型无需置null
//        for (int i = 0; i < this.usedSize; i++) {
//            this.elem[i] = null;
//        }
        this.usedSize = 0;
    }

    // 打印顺序表，注意：该方法并不是顺序表中的方法，为了方便看测试结果给出的
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(elem[i] + " ");

        }
        System.out.println();
    }
}
