record Alien(int id , String name){
   public Alien{
    if(id == 0)
        throw new IllegalArgumentException("id cant be 0");
   }
}
public class Recordclass {
    public static void main(String[] args) {

        Alien a1 = new Alien(2,"John");
        Alien a2 = new Alien(1,"John");
        System.out.println(a1.name());
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        
    }
}
