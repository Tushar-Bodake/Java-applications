import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private  int age;
    private String name;
    
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}

class Methodref {
    public static void main(String[] args) {

        List <String> names = Arrays.asList("Tushar","Akib","Ritesh");

        List <Student> students = new ArrayList<>();

        students = names.stream()
                        .map(Student :: new )
                        .toList();

        System.out.println(students);
    }
}