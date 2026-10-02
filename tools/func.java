@FunctionalInterface
interface A {
    int show(int i, int j);
}

public class Func {
    public static void main(String[] args) {

        A obj = (i,  j) -> i + j;

        int result = obj.show(5, 6);
        System.out.println(result);
    }
}