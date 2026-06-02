
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();
      //  method2();

        System.out.println("End of program");

    }

     public static void method1() {
        System.out.println("--- Method 1 Start ---");
        method2();
        System.out.println("--- Method 1 End ---");
     }

    public static void method2() {
        System.out.println("--- Method 2 Start ---");
        Scanner Scan = new Scanner(System.in);

        try {
            String[] vect = Scan.nextLine().split(" ");
            int position = Scan.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position! ");
            e.printStackTrace();
            Scan.next();
        } catch (InputMismatchException e) {
            System.out.println("Input Erro!");
        }
        Scan.close();
        System.out.println("--- Method 2 End ---");
    }
}