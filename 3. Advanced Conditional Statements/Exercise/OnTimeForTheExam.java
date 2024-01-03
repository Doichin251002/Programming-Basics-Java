import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hourExam = Integer.parseInt(scan.nextLine());
        int minExam = Integer.parseInt(scan.nextLine());
        int hourCome = Integer.parseInt(scan.nextLine());
        int minCome = Integer.parseInt(scan.nextLine());

        int minExamTIme = hourExam * 60 + minExam;
        int minComeTime = hourCome * 60 + minCome;

        int diff = Math.abs(minExamTIme - minComeTime);

        if (minExamTIme < minComeTime) {
            System.out.println("Late");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours after the start.", hour, min);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        }
        else if (minExamTIme == minComeTime || diff <= 30) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        }
        else {
            System.out.println("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start.", hour, min);
            }
            else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
