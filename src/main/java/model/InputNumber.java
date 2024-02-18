package model;

public class InputNumber {

    private final int number;

    public InputNumber(final String number) {
        try {
            this.number = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new RuntimeException();
        }
    }


    public int getInputNumber() {
        return this.number;
    }
}
