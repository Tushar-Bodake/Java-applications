import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach{
    public static void main(String[] args) {
        
        List <Integer> nums = Arrays.asList(1,2,3,4,6);
        
        Consumer <Integer> conn = n -> System.out.println(n);

        nums.forEach(conn);
        
    }
} 