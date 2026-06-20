import java.util.Scanner;
public class vote {
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int age=sc.nextInt();
          System.out.println(age);

          if(age>=18){
            System.out.println("Eligible for vote");
          }
          else{
            System.out.println("Not Eligible for vote");
          }
    }
    
}
