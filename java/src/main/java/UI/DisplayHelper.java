package UI;

import main.ExpressionSolver;

public class DisplayHelper {
    String displayValue = "";

    public void addValue(String displayValue) {
        this.displayValue += displayValue;
    }

    public String getValue() {
        return displayValue;
    }

    public void clearValue() {
        this.displayValue = "";
    }

    public void compute() {
        try {
            this.displayValue = Integer.toString(ExpressionSolver.solve(this.displayValue),4);
        } catch (Exception ex) {
            this.displayValue = "Error";
        }
    }
}
