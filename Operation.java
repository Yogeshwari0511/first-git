import java.util.Scanner;
public class Operation {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println("a:");

        int b=in.nextInt();
        System.out.println("b:");

        int add=a+b;
        int sub=a-b;
        int Multiply=a*b;
        int Division=a/b;

        System.out.println("add:" +add);
        System.out.println("sub:"+sub);
        System.out.println("Multiply:+Multiply");
        System.out.println("Division:" +Division);


    }
    
}
