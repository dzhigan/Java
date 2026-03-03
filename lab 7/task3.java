public class task3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        double product = 1;
        boolean hasNegative = false;

        for (int i = 0; i < 12; i++) {
            A[i] = Math.random() * 20 - 10;
            if (A[i] < 0) {
                product *= A[i];
                hasNegative = true;
            }
            System.out.print(A[i] + " ");
        }

        if (hasNegative)
            System.out.println("\nПроизведение отрицательных: " + product);
        else
            System.out.println("\nОтрицательных нет");
    }
}