import java.util.Arrays;
import java.util.List;

class Methodref {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("tushar","akib","ritesh");

        List <String> nm = names.stream()
                    .map(n -> n.toUpperCase())
                    .toList();
        System.out.println(nm);
    }
}