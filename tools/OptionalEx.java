import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Tushar", "lami","john");

        Optional <String> str = names.stream()
                    .filter(st -> st.contains("x"))
                    .findFirst();
        
    System.out.println(str.orElse("not found"));
    }
}
