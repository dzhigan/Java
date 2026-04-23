import java.util.Scanner;
import java.util.Random;

public class AllTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nВыбери задачу (1-10, 0 — выход):");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Введите N: ");
                    int n = scanner.nextInt();
                    int i = 1, sum = 0;
                    do {
                        sum += i;
                        i++;
                    } while (i <= n);
                    System.out.println("Сумма: " + sum);
                    break;
                }

                case 2: {
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    int count = 0;
                    do {
                        number /= 10;
                        count++;
                    } while (number != 0);
                    System.out.println("Количество цифр: " + count);
                    break;
                }

                case 3: {
                    System.out.print("Введите число: ");
                    int n = scanner.nextInt();
                    int i = 1;
                    do {
                        System.out.println(n + " * " + i + " = " + (n * i));
                        i++;
                    } while (i <= 10);
                    break;
                }

                case 4: {
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    int max = 0;
                    do {
                        int digit = number % 10;
                        if (digit > max) max = digit;
                        number /= 10;
                    } while (number > 0);
                    System.out.println("Максимальная цифра: " + max);
                    break;
                }

                case 5: {
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    int original = number, reversed = 0;
                    do {
                        int digit = number % 10;
                        reversed = reversed * 10 + digit;
                        number /= 10;
                    } while (number > 0);

                    if (original == reversed)
                        System.out.println("Палиндром");
                    else
                        System.out.println("Не палиндром");
                    break;
                }

                case 6: {
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    int count = 0;
                    do {
                        int digit = number % 10;
                        if (digit % 2 == 0) count++;
                        number /= 10;
                    } while (number > 0);
                    System.out.println("Чётных цифр: " + count);
                    break;
                }

                case 7: {
                    Random random = new Random();
                    int number;
                    do {
                        number = random.nextInt(10);
                        System.out.println(number);
                    } while (number != 0);
                    System.out.println("Выпало 0. Стоп.");
                    break;
                }

                case 8: {
                    int number, sum = 0;
                    do {
                        System.out.print("Введите число (0 — выход): ");
                        number = scanner.nextInt();
                        sum += number;
                    } while (number != 0);
                    System.out.println("Сумма: " + sum);
                    break;
                }

                case 9: {
                    scanner.nextLine(); // очистка буфера
                    String password;
                    do {
                        System.out.print("Введите пароль (мин. 6 символов): ");
                        password = scanner.nextLine();
                    } while (password.length() < 6);
                    System.out.println("Пароль принят");
                    break;
                }

                case 10: {
                    int number, min = Integer.MAX_VALUE;
                    do {
                        System.out.print("Введите число (0 — выход): ");
                        number = scanner.nextInt();
                        if (number != 0 && number < min) {
                            min = number;
                        }
                    } while (number != 0);

                    if (min == Integer.MAX_VALUE)
                        System.out.println("Нет данных");
                    else
                        System.out.println("Минимум: " + min);
                    break;
                }

                case 0:
                    System.out.println("Выход...");
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }

        } while (choice != 0);
    }
}