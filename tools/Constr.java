package tools;

class Constr{
    int age;
    static int roll = 11;

    static {
        System.out.println("In static block");
    }

    public Constr(){
        age= 20;
    }
    public int disp(){
        return age;
    }

    public static void display(Constr c){
        System.out.println("in static block : " +  roll + " Marks : "+c.age);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Constr");
        // Constr c = new Constr();
        // System.out.println(c.disp());
        // System.out.println(Constr.roll);

        // Constr.display(c);

    }
}