import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String student = scan.nextLine();
        int grade = 0;
        double sumRate = 0;

        while (grade < 12) {
            double rate = Double.parseDouble(scan.nextLine());
            sumRate += rate;
            grade++;
            if (rate < 4) break;
        }
        
        if (grade == 12) System.out.printf("%s graduated. Average grade: %.2f", student, sumRate/grade);
        else System.out.printf("%s has been excluded at %d grade", student, grade);
    }
}
