public class Exce {
    public static void main(String[] args) {
        int i =8;
        int j = 2;

        String str= null;

        int arr[] = new int[5];

        try {
            int result = i / j;
            System.out.println(result);

            System.out.println("String is null");

            System.out.println(arr[0]);
            System.out.println(arr[6]);

        } catch (ArithmeticException e) {
            System.out.println("error occured..."+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array ou of bounds"+e);
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception: " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong"+e);
        }

        System.out.println("stopped");
    }
}
