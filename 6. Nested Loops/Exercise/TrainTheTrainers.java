import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jury = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        double totalAvRate = 0;
        int count = 0;

        while (!command.equals("Finish")) {
            String title = command;
            double avRate = 0;

            for (int i = 0; i < jury; i++) {
                double rate = Double.parseDouble(scan.nextLine());
                avRate += rate;
            }
            avRate = avRate / jury;
            totalAvRate += avRate;
            count++;
            System.out.printf("%s - %.2f.%n", title, avRate);
            command = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalAvRate / count);
    }
}
