import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}



public class Main3 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 12);
        Student student2 = new Student("lisi", 18);

        Student[] students = new Student[]{student1,
                student2, new Student("wangwu", 20)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
