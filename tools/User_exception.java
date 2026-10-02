 class TusharException extends Exception {
        public TusharException(String str) {
            super(str);
        }
    }

public class User_exception {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;

            if (j == 0) {
                throw new TusharException("thrown exception");
            }
        } catch (TusharException e) {
            j = 18 / 1;
            System.out.println("thats default value : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Default Exception Handler :" + e);
        }

        System.out.println(j);
    }
}
    

