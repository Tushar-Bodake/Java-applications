sealed class A permits B,C{

}
non-sealed class B extends A{

}
final class C extends A{

}
class D extends B{

}
sealed interface X permits Y{

}
non-sealed interface Y extends X{

}

public class Sealedex{
    public static void main(String[] args) {
        
    }
}