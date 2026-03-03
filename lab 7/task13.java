public class task13 {
    public static void main(String[] args) {
        int[] C = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            C[i] = (int)(Math.random() * 50);
            sum += C[i];
            System.out.print(C[i] + " ");
        }

        System.out.println("\nСреднее: " + (double)sum / 20);
    }
}