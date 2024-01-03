import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        double res = 0;
        String evenOdd = "";
        boolean isZero = false;

        switch (operator) {
            case "+":
                res = numOne + numTwo;
                break;
            case "-":
                res = numOne - numTwo;
                break;
            case "*":
                res = numOne * numTwo;
                break;
            case "/":
                if (numTwo == 0) isZero = true;
                else res = numOne * 1.0 / numTwo;
                break;
            case "%":
                if (numTwo == 0) isZero = true;
                else res = numOne % numTwo;
                break;
        }
        if (res % 2 == 0) evenOdd = "even";
        else evenOdd = "odd";

        if (operator.equals("+") || operator.equals("-") || operator.equals("*"))
            System.out.printf("%d %s %d = %.0f - %s", numOne, operator, numTwo, res, evenOdd);
        else if (operator.equals("/") && !isZero)
            System.out.printf("%d %s %d = %.2f", numOne, operator, numTwo, res);
        else if (operator.equals("%") && !isZero)
            System.out.printf("%d %s %d = %.0f", numOne, operator, numTwo, res);
        else
            System.out.printf("Cannot divide %d by zero", numOne);
    }
}
