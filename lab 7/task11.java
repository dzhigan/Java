public class task11 {
    public static void main(String[] args) {
        int[] A = new int[25];
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < 25; i++) {
            A[i] = (int)(Math.random() * 100);
            System.out.print(A[i] + " ");

            if (A[i] < A[minIndex]) minIndex = i;
            if (A[i] > A[maxIndex]) maxIndex = i;
        }

        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        System.out.println("\nПосле обмена:");
        for (int x : A)
            System.out.print(x + " ");
    }
}