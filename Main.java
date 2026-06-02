
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        try {
            String[] vect = Scan.nextLine().split(" ");
            int position = Scan.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position! ");
        }catch(InputMismatchException e){
            System.out.println("Input Erro!");
        }

        System.out.println("End of program");

        Scan.close();
    }
}