public class task4 {
    public static void main(String[] args) {
        int[] C = new int[25];
        long product = 1;

        for (int i = 0; i < 25; i++) {
            C[i] = (int)(Math.random() * 20 - 10);
            if (C[i] > 0) product *= C[i];
            System.out.print(C[i] + " ");
        }

        System.out.println("\nПроизведение положительных: " + product);
    }
}