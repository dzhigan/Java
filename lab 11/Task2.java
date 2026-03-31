import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont = "yes";

        while (cont.equals("yes")) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            char op = sc.next().charAt(0);

            if (op == '+') System.out.println(a + b);
            if (op == '-') System.out.println(a - b);
            if (op == '*') System.out.println(a * b);
            if (op == '/' && b != 0) System.out.println(a / b);

            System.out.println("Continue? yes/no");
            cont = sc.next();
        }
    }
}