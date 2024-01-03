package January2022;

import java.util.Scanner;

public class FilmLocation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String location = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double price = 0;

       if (season.equals("Winter")) {
           switch (location) {
               case "Dubai":
                   price = 45000;
                   break;
               case "Sofia":
                   price = 17000;
                   break;
               case "London":
                   price = 24000;
                   break;
           }
       } else if (season.equals("Summer")) {
           switch (location) {
               case "Dubai":
                   price = 40000;
                   break;
               case "Sofia":
                   price = 12500;
                   break;
               case "London":
                   price = 20250;
                   break;
           }
       }
       price *= days;
       if (location.equals("Dubai")) price -= price * 0.3;
       else if (location.equals("Sofia")) price += price * 0.25;

       if (price <= budget) System.out.printf("The budget for the movie is enough! We have %.2f leva left!", Math.abs(budget - price));
       else System.out.printf("The director needs %.2f leva more!", Math.abs(budget - price));
    }
}
