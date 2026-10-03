public class Throws {

    public  void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
    public static void main(String[] args) {
        
        Throws t = new Throws();
        try {
            t.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
