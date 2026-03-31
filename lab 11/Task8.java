import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println(a + b);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}