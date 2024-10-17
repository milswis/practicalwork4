import java.util.Scanner;

public class SentenceCounterWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();
        int sentenceCount = 0;
        int i = 0;

        while (i < text.length()) {
            char currentChar = text.charAt(i);
            if (currentChar == '.' || currentChar == '!' || currentChar == '?') {
                sentenceCount++;
            }
            i++;
        }

        System.out.println("Кількість речень: " + sentenceCount);
    }
}