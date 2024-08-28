package 泛型;

//类似c++的模板

class MyArray<T> {
    public Object[] array = new Object[10];

    public void set(int pos, T val) {
        array[pos] = val;
    }

    public T get(int pos) {
        return (T) array[pos];
    }
}

//实现一个泛型，写一个能够输出对应类型数组最大值的方法
//注意加extends Comparable，否则无法比较
//T extends Comparable<T>  表示T一定实现了comparable接口，编译时T就不会被擦除为Object，因为Object中没有实现该接口
class Alg<T extends Comparable<T>> {
    public T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

public class Test {
    public static void main(String[] args) {
        MyArray<String> array = new MyArray<>();


        Integer[] array1 = new Integer[]{1, 2, 46, 789 ,45};
        array.set(0, "hello");
//        array.set(1, 10);  此时放整形会报错

        array.set(1, "baga");
        array.set(2, "asfsaf");

        Alg<Integer> alg = new Alg<>();
        System.out.println(alg.findMax(array1));
    }
}
