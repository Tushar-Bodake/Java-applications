class A{
    public void show(){
        System.out.println("IN A");
    }
}
class B extends A{
    public void display(){
        System.out.println("IN B");
    }
}

public class Casting {
    public static void main(String[] args) {

        A obj1 = new B();
        obj1.show();

        B obj2 = (B) obj1;
        obj2.display();
    }
}