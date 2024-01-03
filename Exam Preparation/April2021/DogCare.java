package April2021;

import java.util.Scanner;

public class DogCare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kgFood = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        boolean isEnough = false;
        int grFood = kgFood * 1000;
        int totalFood = 0;

        while (!command.equals("Adopted")) {
            int currentFood = Integer.parseInt(command);
            totalFood += currentFood;
            if (totalFood <= grFood) isEnough = true;
            else isEnough = false;
            command = scan.nextLine();
        }
        if (isEnough) System.out.printf("Food is enough! Leftovers: %d grams.", Math.abs(totalFood - grFood));
        else System.out.printf("Food is not enough. You need %d grams more.", Math.abs(totalFood - grFood));
    }
}
