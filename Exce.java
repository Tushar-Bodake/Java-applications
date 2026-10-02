public class Exce {
    public static void main(String[] args) {
        int i =8;
        int j = 2;

        try {
            int result = i / j;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("error occured..."+ e);
        }

        System.out.println("stopped");
    }
}
