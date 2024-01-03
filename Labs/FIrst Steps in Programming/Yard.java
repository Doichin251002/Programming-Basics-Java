import java.util.Arrays;
import java.util.Scanner;

public class Yard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sqMeters = Double.parseDouble(scanner.nextLine());
        double sum = sqMeters * 7.61;
        double discount = sum * 0.18;
        double finalSum = sum - discount;
        System.out.printf("The final price is: %f lv.", finalSum);
        System.out.printf("The discount is: %f lv.", discount);
    }
}
