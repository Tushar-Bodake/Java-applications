import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEach{
    public static void main(String[] args) {
        
        List <Integer> nums = Arrays.asList(1,2,3,4,6);

        Stream <Integer> s1= nums.stream();

        s1.forEach(n -> System.out.println(n));
        
    }
} 