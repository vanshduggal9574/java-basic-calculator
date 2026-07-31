import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int x = sc.nextInt();
         System.out.println(x);

         int y = sc.nextInt();
         System.out.println(y);

         System.out.println("choose a option : ");
         System.out.println(" addition (+) ");
         System.out.println("substraction (-) ");
         System.out.println("multiplication (*) ");
         System.out.println("division (/) ");

         int choice = sc.nextInt();
         System.out.println(choice);

         switch(choice) {
            case 1: System.out.println(x+y);
            break;
            case 2: System.out.println(x-y);
            break;
            case 3: System.out.println(x*y);
            break;
            case 4: System.out.println(x/y);
            break;
            case 5: if (y==0) {
                System.out.println("cannot divide by zero");
            } else { System.out.println(x/y); }
            break;
            default : System.out.println("invalid");

            
            
            

         }
    }
}