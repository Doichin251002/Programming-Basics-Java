package October2021;

import java.util.Scanner;

public class PetsFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double food = Double.parseDouble(scan.nextLine());
        int totalDogFood = 0;
        int totalCatFood = 0;
        double biscuits = 0;

        for (int i = 1; i <= days; i++) {
            int currentDogFood = Integer.parseInt(scan.nextLine());
            int currentCatFood = Integer.parseInt(scan.nextLine());

            totalDogFood += currentDogFood;
            totalCatFood += currentCatFood;

            if (i == 3) {
                int totalFood3day = currentDogFood + currentCatFood;
                biscuits = totalFood3day * 0.1;
            }
        }

        int totalFood = totalCatFood + totalDogFood;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", Math.floor(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFood / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogFood * 1.0 / totalFood * 100);
        System.out.printf("%.2f%% eaten from the cat.", totalCatFood * 1.0 / totalFood * 100.0);
        }
    }
