
abstract class A{
    public abstract void play();
    public  void drive(){
        System.out.println("driveeeeee");
    }

}
class B extends A{
    public void play(){
        System.out.println("playyyyyyy");
    }
}

class Abs{

    public static void main(String args[]){
        A obj = new B();
        obj.drive();
        obj.play();
    }
}