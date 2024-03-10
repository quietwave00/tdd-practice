package view;

import java.util.Scanner;

public class CalculatorView {

    public String printInputNumber() {
        System.out.println("숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
