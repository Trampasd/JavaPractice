public class Date {
    public int year;
    public int month;
    public int day;

    public static int other;

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    {
        System.out.println("实例代码块！！！");
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }

    static {
        System.out.println("静态代码块！！！");
        other = 10;
    }

    public Date() {
        System.out.println("无参数构造函数！！！");
    }

    //this是对当前变量的引用
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate() {
        System.out.println("年："+year+" 月："+month+" 日："+day);
    }

    public static int getOther() {
        return other;
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }

}
