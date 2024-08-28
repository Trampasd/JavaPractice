import java.util.Arrays;

public class Main {
    //数组拷贝方法一for循环
    public static int[] copy(int[] array){
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public static void main(String[] args) {//TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>

        int[] array1 = new int[]{1, 2, 3, 4};

        //使用for循环拷贝
        int[] array2 = copy(array1);
        System.out.println(Arrays.toString(array2));

        //数组拷贝方法二 用Arrays包中的copyOf方法
        int[] array3 = Arrays.copyOf(array1, array1.length);
        System.out.println(Arrays.toString(array3));

        //数组长度*2相当于数组扩容
        int[] array4 = Arrays.copyOf(array1, array1.length*2);
        System.out.println(Arrays.toString(array4));

        //Arrays包中也提供了按范围复制数组
        //java中的from to范围一般是左闭右开的 like：[2,4)
        //如果范围过大则能拷贝多少拷贝多少[2, 40)
        int[] array5 = Arrays.copyOfRange(array1, 2, 4);
        System.out.println(Arrays.toString(array5));

        //方法三System.arraycopy的使用
        int[] array6 = new int[array1.length];
        //五个参数分别是：源数组，源数组拷贝位置，目的数组，目的数组拷贝位置，拷贝长度
        System.arraycopy(array1, 0, array6, 1, array1.length-2);
        System.out.println(Arrays.toString(array6));

        //Arrays.sort()可以对数组进行排序
        int[] array7 = new int[]{13, 5 ,2 ,46, 22};

        bubbleSort(array7);
        System.out.println(Arrays.toString(array7));
        System.out.println("===================");

        Arrays.sort(array7);
        System.out.println(Arrays.toString(array7));


    }

    //自己实现Arrays.toString方法
    public static String myToString(int[] array){
        String s = "[";
        for (int i = 0; i < array.length; i++) {
            s += array[i];
            if (i != array.length - 1) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    //冒泡排序
    public static void bubbleSort(int[] array) {
        //i代表趟数
        for (int i = 0; i < array.length - 1; i++) {
            boolean flg = false;
            //j代表的是每一趟比较的次数
            for (int j = 1; j < array.length - i; j++) {//array.length-i 表示优化，减少比较次数
                if(array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
                //优化：说明有序，如果某一趟没有进行交换，则已经有序
            }
        }
    }


}