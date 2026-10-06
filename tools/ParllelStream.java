import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParllelStream {

    public static void main(String[] args) {
        
        int size = 10_000;
        List<Integer> nums = new ArrayList<Integer>(size);

        Random r = new Random();
        for(int i=0 ; i<size ;i++){
            nums.add(r.nextInt(100));
        }
        
        long startSeq = System.currentTimeMillis();
        int s1 = nums.stream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startPar = System.currentTimeMillis();
        int s2 = nums.parallelStream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();
        long endPar = System.currentTimeMillis();
    
        System.out.println(s1 + " " + s2);

        System.out.println("Stream = " + (startSeq - endSeq));
        System.out.println("ParllelStream = " + (startPar - endPar));


    }
    
}
