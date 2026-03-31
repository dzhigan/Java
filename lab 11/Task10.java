import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double res = a + b;
        history.add(a + "+" + b + "=" + res);

        System.out.println(history);
    }
}