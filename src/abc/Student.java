package abc;

public class Student {
    private String name;
    static int age;

    public static void setAge(int age) {
        Student.age = age;
    }

    public void adultTrueFalse() {
        if(age >= 19) {
            System.out.println("성인");
        } else {
            System.out.println("미성년");
        }
    }
}
