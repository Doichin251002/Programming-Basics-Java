import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flower = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        double cost = 0;

        switch (flower){
            case "Roses" :
                cost = count * 5;
                if (count > 80) {
                    cost = cost - (cost * 0.1);
                }
                break;
            case "Dahlias":
                cost = count * 3.8;
                if (count > 90) {
                    cost = cost - (cost * 0.15);
                }
                break;
            case "Tulips":
                cost = count * 2.8;
                if (count > 80) {
                    cost = cost - (cost * 0.15);
                }
                break;
            case "Narcissus":
                cost = count * 3;
                if (count < 120) {
                    cost = cost + (cost * 0.15);
                }
                break;
            case "Gladiolus":
                cost = count * 2.5;
                if (count < 80) {
                    cost = cost + (cost * 0.2);
                }
                break;
        }

        if (budget >= cost)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    count, flower, budget - cost);
        else System.out.printf("Not enough money, you need %.2f leva more.", cost - budget);
    }
}
