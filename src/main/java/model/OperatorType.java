package model;

public enum OperatorType {
    PLUS("+"),
    MINUS("-"),
    TIMES("*"),
    DIVISION("/")
    ;

    private final String operator;

    OperatorType(final String operator) {
        this.operator = operator;
    }

    public String getOperatorValue() {
        return this.operator;
    }


    public static OperatorType from(final String operator) {
//        for (OperatorType operatorType : OperatorType.values()) {
//            if (operatorType.operator.equals(operator)) {
//                return operatorType;
//            }
//        }
//        throw new IllegalArgumentException("업음");
        return OperatorType.valueOf(operator);
    }
}