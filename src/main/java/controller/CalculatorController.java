package controller;

import model.InputNumber;
import view.CalculatorView;

public class CalculatorController {

    private final CalculatorView calculatorView;

    public CalculatorController() {
        calculatorView = new CalculatorView();
    }

    public void run() {
        final String number = calculatorView.printInputNumber();
        InputNumber inputNumber = new InputNumber(number);
    }
}
