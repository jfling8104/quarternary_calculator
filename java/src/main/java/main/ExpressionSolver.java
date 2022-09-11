package main;

public class ExpressionSolver {
    private ExpressionSolver() {
        throw new UnsupportedOperationException("This class only contains Static methods and there is no need to instantiate it");
    }

    public static int solve(String expression) {

        if (expression.contains("+")) {
            int indexOfPlusSign = expression.indexOf("+");
            String firstDigit = expression.substring(0, indexOfPlusSign);
            String secondDigit = expression.substring(indexOfPlusSign + 1);
            return sum(firstDigit, secondDigit);

        } else if (expression.contains("-")) {
            int indexOfMinusSign = expression.indexOf("-");
            String firstDigit = expression.substring(0, indexOfMinusSign);
            String secondDigit = expression.substring(indexOfMinusSign + 1);
            return subtraction(firstDigit, secondDigit);

        } else if (expression.contains("*")) {
            int indexOfMultiplySign = expression.indexOf("*");
            String firstDigit = expression.substring(0, indexOfMultiplySign);
            String secondDigit = expression.substring(indexOfMultiplySign + 1);
            return multiply(firstDigit, secondDigit);
        } else if (expression.contains("/")) {
            int indexOfDivideSign = expression.indexOf("/");
            String firstDigit = expression.substring(0, indexOfDivideSign);
            String secondDigit = expression.substring(indexOfDivideSign + 1);
            return divide(firstDigit, secondDigit);
        } else {
            throw new UnsupportedOperationException("Operation not found");
        }

    }

    private static int subtraction(String a, String b) {

        return Integer.parseInt(String.valueOf(a), 4) - Integer.parseInt(String.valueOf(b), 4);

    }

    public static int sum(String a, String b) {
        return Integer.parseInt(String.valueOf(a), 4) + Integer.parseInt(String.valueOf(b), 4);

    }

    public static int multiply(String a, String b) {
        return Integer.parseInt(String.valueOf(a), 4) * Integer.parseInt(String.valueOf(b), 4);

    }

    public static int divide(String a, String b) {
        return Integer.parseInt(String.valueOf(a), 4) / Integer.parseInt(String.valueOf(b), 4);

    }

}
