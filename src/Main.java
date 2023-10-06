import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int count = 0;

        System.out.println("Enter numbers, type -1 to stop:");
        int input = scanner.nextInt();

        while (input != -1 && count < 100) {
            numbers[count] = input;
            count++;
            System.out.print(": ");
            input = scanner.nextInt();
        }

        System.out.println("Here are your numbers in reverse order:");

        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}