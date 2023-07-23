import java.util.Scanner;


public class Calculator {
    private static java.lang.Exception Exception;

    public static void main(String[] args) {
        String line = null;
        try (Scanner scanner = new Scanner(System.in)){
            line = scanner.nextLine();
        }
        System.out.println(calc(line));
    }


    public static String calc(String line){
        try {
            String firstNumber = line.substring(0, line.indexOf(" "));
            String operandLine = line.substring(line.indexOf(" ") + 1, line.indexOf(" ") + 2);
            String secondNumber = line.substring(line.indexOf(" ") + 3);

            if (line.indexOf(" ", line.indexOf(" ")+3) != -1) {
                throw Exception;
            }

            int first = Integer.parseInt(firstNumber);
            int second = Integer.parseInt(secondNumber);
            char operand = operandLine.charAt(0);

            if ((operand == '+') || (operand == '-') || (operand == '/') || (operand == '*')) {
                line = calcArabic(first, second, operand);
            } else {
               throw Exception;
            }

        } catch (Exception e){
            line = "throws Exception";
        }
        return line;
    }

    private static String calcArabic(int first, int second, char operand) {

        String line = null;

        try {
            if ((first < 1) || (second <1)) {
                throw Exception;
            }

            if ((first > 10) || (second > 10)) {
                throw Exception;
            }

            int result = 0;

            switch (operand) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
            }

            line = Integer.toString(result);

        } catch (Exception e) {
            line = "throws Exception";
        }

        return line;
    }


}