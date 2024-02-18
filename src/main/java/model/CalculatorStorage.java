package model;

import java.util.ArrayList;
import java.util.List;

public class CalculatorStorage {
    private final List<Integer> numbers = new ArrayList<>();
    private final List<String> operations = new ArrayList<>();

    public void saveNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void saveOperation(String operation) {
        operations.add(operation);
    }

    public List<String> getOperations() {
        return operations;
    }
}
