public class task2 {
    public static void main(String[] args) {
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            B[i] = (int)(Math.random() * 40 - 20);
            if (B[i] > 0) sum += B[i];
            System.out.print(B[i] + " ");
        }

        System.out.println("\nСумма положительных: " + sum);
    }
}