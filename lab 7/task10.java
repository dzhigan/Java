public class task10 {
    public static void main(String[] args) {
        int[][] D = new int[7][7];
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            D[i][i] = (int)(Math.random() * 20);
            sum += D[i][i];
        }

        System.out.println("Среднее диагонали: " + (double)sum / 7);
    }
}