import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_comparator {
    static class Students {
        String name;
        int age;

        public Students(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Student[age= " + age + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {

        Comparator<Students> com = new Comparator<Students>() {
            public int compare(Students i, Students j) {
                if (i.age > j.age) {
                    return 1;
                }
                else{
                    return  -1;
                }
            }
        };

        List<Students> stud = new ArrayList<>();
        stud.add(new Students("Tushar", 20));
        stud.add(new Students("Akib", 21));

        Collections.sort(stud, com);

        for (Students s : stud) {
            System.out.println(s);
        }
    }
}
