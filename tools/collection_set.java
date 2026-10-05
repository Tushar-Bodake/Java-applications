import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class collection_set {
    public static void main(String[] args) {
        Collection <Integer> nums = new TreeSet<>();

        nums.add(22);
        nums.add(72);
        nums.add(12);
        nums.add(52);

        Iterator <Integer> itr = nums.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int n : nums){
            System.out.println(n);
        }
    }
}
