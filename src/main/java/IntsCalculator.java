public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public double sum(int a, int b) {
        double result = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUM)
                .result();
        return result;
    }

    @Override
    public double mult(int a, int b) {
        double result = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.MULT)
                .result();
        return result;
    }

    @Override
    public double pow(int a, int b) {
        double result = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return result;
    }

    public double sub(int a, int b) {
        double result = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result();
        return result;
    }

    public double div(int a, int b) {
        double result = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result();
        return result;
    }
}

