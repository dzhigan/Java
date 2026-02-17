import java.util.Scanner;

class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= N) {
            sum += i;
            i++;
        }

        System.out.println(sum);

        scanner.close();
    }
}
