package packages;

public class PrivateAccessModifier {

    private static void message(){
        System.out.println("The private access modifier");
    }
    public static void main(String[] args) {
        message();
    }
}
