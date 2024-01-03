import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countBadRate = Integer.parseInt(scan.nextLine());
        int countTasks = 0;
        int badRate = 0;
        double sumRate = 0;
        String lastTask = "";
        boolean isNeedBreak = false;

        while (badRate != countBadRate) {
            String task = scan.nextLine();
            if (task.equals("Enough")) break;
            int rate = Integer.parseInt(scan.nextLine());

            if (rate <= 4) {
                badRate++;
                if (badRate == countBadRate) isNeedBreak = true;
            }

            sumRate += rate;
            countTasks++;
            lastTask = task;
        }

        if (isNeedBreak) System.out.printf("You need a break, %d poor grades.", countBadRate);
        else System.out.printf("Average score: %.2f %nNumber of problems: %d %nLast problem: %s",
                sumRate / countTasks, countTasks, lastTask);
    }
}
