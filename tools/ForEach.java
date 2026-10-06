import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEach{
    public static void main(String[] args) {
        
        List <Integer> nums = Arrays.asList(1,2,3,4,6);

        Stream <Integer> sortedValues = nums.stream()
                            .filter(n -> n%2==0);
                           
        sortedValues.forEach(n -> System.out.println(n));
        
    }
} 