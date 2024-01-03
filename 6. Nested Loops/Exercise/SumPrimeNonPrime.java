import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!command.equals("stop")) {
            int num = Integer.parseInt(command);
            if (num < 0) {
                System.out.println("Number is negative.");
                command = scan.nextLine();
                continue;
            }
            int countPrime = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) countPrime++;
            }

            if (countPrime == 2) primeSum += num;
            else nonPrimeSum += num;
            command = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
