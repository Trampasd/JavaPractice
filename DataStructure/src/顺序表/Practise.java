package 顺序表;


import java.util.ArrayList;
import java.util.List;


public class Practise {
    public static void main(String[] args) {
//        String str1 = "welcome to cvte";
//        String str2 = "come";
//        List<String> list = func(str1, str2);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//        }

        List<List<Integer>> list = generate(5);
        System.out.println(list.toString());
    }


    /*面试题：str1：welcome to cvte
       str2：come
让str1中去除str2中出现的字符*/
//用list实现
    //思路：遍历str1，若str1中的字符没在str2中出现过，则把它放入list中
    public static List<String> func(String str1, String str2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch+"")) {
                list.add(ch+"");
            }
        }
        return list;
    }


    //杨辉三角，画图思考
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        list.add(row);
        //上面处理的均是第一行

        //下面从第二行开始处理
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            //处理当前行的第一列
            curRow.add(1);

            //处理中间列
            for (int j = 1; j < i; j++) {
                curRow.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }

            //处理当前行的最后一列
            curRow.add(1);

            //最后将这一行放入list中
            list.add(curRow);
        }
        return list;
    }


}
