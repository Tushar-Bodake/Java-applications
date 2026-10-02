
public interface Inn {

    int num= 10;
    String name = "Tushar";
    void code();
    void play();
}

interface InnerInn {
    void dance();
}

class MostInn implements Inn,InnerInn{

    public void dance() {
        System.out.println("Dancing...");
    }

    public void code() {
         System.out.println("coding...");
    }

    public void play() {
        System.out.println("Playing...");
    }

}

class Demo {

    public static void main(String[] args) {
        Inn obj = new MostInn();
        obj.code();
        obj.play();

        InnerInn obj1 = new MostInn();
        obj1.dance();

        System.out.println(Inn.name);
        System.out.println(Inn.num);
    }
}
