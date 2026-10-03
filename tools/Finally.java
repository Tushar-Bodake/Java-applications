import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finally {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int nums = 0;
        BufferedReader br = null;

        try{
            System.out.println("enter a num : ");
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);

            nums = Integer.parseInt(br.readLine());
            System.out.println(nums);
        }
        finally{
            br.close();
        }
    }
}
