import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
//        int[] array1 = new int[]{1, 2, 4};
//        transForm(array1);
//        System.out.println(Arrays.toString(array1));
//        System.out.println(avg(array1));

//        int[] array2 = new int[]{1,2,3};
//        adjust(array2);
//        System.out.println(Arrays.toString(myBubbleSort(array2)));
//        int[] array3 = new int[]{2, 7, 11, 15};
//        returnTarget(9, array3);
//        int[] array4 = new int[]{2,2,1,1,4};
//        System.out.println(findOnlyOne(array4));
//        int[] array5 = new int[]{2,2,1,1,1,2,2};
//        System.out.println(findNum(array5));
//        int[] array6 = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
//        System.out.println(judgeOdd(array6));
//        charSet("aaBBCCddEEFFgg");
        System.out.println(countSegments(""));
    }

    public static void transForm(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = 1.0 * sum / array.length;
        return avg;
    }

    //奇数位于偶数之前
    public static void adjust(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            while (low < high && array[low] % 2 != 0) {
                low++;
            }
            while (low < high && array[high] % 2 == 0) {
                high--;
            }
            int tmp = array[low];
            array[low] = array[high];
            array[high] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    //冒泡排序
    public static int[] myBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    //两数之和
    public static void returnTarget(int target, int[] array) {
        int[] position = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] + array[j] == target) {
                    position[0] = i;
                    position[1] = j;
                    System.out.println(Arrays.toString(position));
                }
            }
        }
    }

    //只出现一次的数字
    public static int findOnlyOne(int[] arr) {
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ret ^= arr[i];
        }
        return ret;
    }

    //寻找出现次数大于⌊ n/2 ⌋的元素。注意这里是大于不是大于等于，所以array.length/2可以满足题意
    public static int findNum(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    //判断是否存在三个连续奇数
    public static boolean judgeOdd(int[] arr) {
        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                flg++;
                if (flg == 3) {
                    return true;
                }
            } else {
                flg = 0;
            }
        }
        return false;
    }

    public static void charSet(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ret = str.charAt(i);
            if (stringBuilder.indexOf(ret + "") < 0) {
                stringBuilder.append(ret);
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        for(int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            char prech = s.charAt(i-1);
            if(prech == ' ' && ch != ' ') {
                count++;
            }
        }
        if (s.charAt(0) != ' ') {
            count++;
        }
        return count;
    }
}