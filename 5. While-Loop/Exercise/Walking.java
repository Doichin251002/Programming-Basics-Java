import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalSteps = 0;

        while (totalSteps < 10000) {
            String command = scan.nextLine();
            if (command.equals("Going home")) {
                int steps = Integer.parseInt(scan.nextLine());
                totalSteps += steps;
                break;
            }
            else {
                int steps = Integer.parseInt(command);
                totalSteps += steps;
            }
        }

        if (totalSteps < 10000) System.out.printf("%d more steps to reach goal.", Math.abs(totalSteps - 10000));
        else System.out.printf("Goal reached! Good job! %n" +
                "%d steps over the goal!", totalSteps - 10000);
    }
}
