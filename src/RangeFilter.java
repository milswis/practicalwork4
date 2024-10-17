import java.util.Scanner;

public class RangeFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть початкове значення діапазону:");
        int start = scanner.nextInt();

        System.out.println("Введіть кінцеве значення діапазону:");
        int end = scanner.nextInt();

        int primeNumber;
        do {
            System.out.println("Введіть просте число від 1 до 9:");
            primeNumber = scanner.nextInt();
        } while (primeNumber != 2 && primeNumber != 3 && primeNumber != 5 && primeNumber != 7);

        System.out.println("Числа у діапазоні, які не кратні " + primeNumber + ":");
        for (int i = start; i <= end; i++) {
            if (i % primeNumber == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}