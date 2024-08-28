public class Test {


    public static void main(String[] args) {
        String string = "wo niu bi";
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.append(123).append(456).append(789);
        System.out.println(stringBuilder);

        stringBuilder.insert(1, " 2024 ");
        System.out.println(stringBuilder);

        string = stringBuilder.toString();
        System.out.println(string);
    }
}
