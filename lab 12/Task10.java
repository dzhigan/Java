import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        String v = "aeiouаеёиоуыэюя";

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (v.indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }
}