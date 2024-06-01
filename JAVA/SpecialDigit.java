import java.util.Scanner;
 public class SpecialDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is within the range of two-digit numbers (10 to 99)
        if (number < 10 || number > 99) {
            System.out.println("Invalid input. Please enter a two-digit number.");
        } else {
            int digit1 = number / 10; // Extract the tens digit
            int digit2 = number % 10; // Extract the units digit

            int sumOfDigits = digit1 + digit2;
            int productOfDigits = digit1 * digit2;

            if (sumOfDigits + productOfDigits == number) {
                System.out.println(number + " is a special two-digit number.");
            } else {
                System.out.println(number + " is not a special two-digit number.");
            }
        }

    }
}
