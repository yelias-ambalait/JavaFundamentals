package packages;


public class PackageJava {

    public static void addition(int a, int b){
        int result = a+b;
        System.out.println("a+b= "+result);
    }

    protected static int subtract(int firstNumber, int secondNumber){
        return firstNumber-secondNumber;
    }

    static void display(){
        System.out.println("This is a default access modifier");
    }

    private static void message(){
        System.out.println("This is a private access modifier in package class.");
    }



    public static void main(String[] args) {
//        PackageJava p = new PackageJava();
        addition(5,9);
        System.out.println("a+b = "+subtract(51,11));
        display();
        message();

    }
}
