import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        int membersUnder16 = 0;
        int membersOver16 = 0;
        int moneyToys = 0;
        int moneySweaters = 0;

        while (!command.equals("Christmas")) {
            int age = Integer.parseInt(command);
            if (age <= 16) {
                membersUnder16++;
                moneyToys += 5;
            }
            else {
                membersOver16++;
                moneySweaters += 15;
            }
            command = scan.nextLine();
        }
        System.out.printf("Number of adults: %d%n", membersOver16);
        System.out.printf("Number of kids: %d%n", membersUnder16);
        System.out.printf("Money for toys: %d%n", moneyToys);
        System.out.printf("Money for sweaters: %d", moneySweaters);
    }
}
