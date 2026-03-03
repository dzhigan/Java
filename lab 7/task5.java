public class task5 {
    public static void main(String[] args) {
        int[] D = new int[17];
        int sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = (int)(Math.random() * 50);
            sum += D[i];
            System.out.print(D[i] + " ");
        }

        System.out.println("\nСреднее: " + (double)sum / 17);
    }
}