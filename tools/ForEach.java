import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEach{
    public static void main(String[] args) {
        
        List <Integer> nums = Arrays.asList(1,2,3,4,6);

        int result = nums.stream()
                            .filter(n -> n%2==0)
                            .map(n -> n*2)
                            .reduce(0,(c,e)-> c+e);
        
    System.out.println(result);
        
    }
} 