 class Encap {
    private  int age;
    private String name;

   

    public Encap(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Encap() {
    }

    public void setAge(int a){
        age=a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

public static void main(String args[]){

    Encap e = new Encap();

    System.out.println(e.getName() + " : " + e.getAge());
}
}