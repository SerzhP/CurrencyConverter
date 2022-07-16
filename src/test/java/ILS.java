public class ILS extends Coin{
    private final double value = 0.28;
    private final String text = "  ILS to USD";


    @Override
    public double getValue() {
        return value;
    }
//    Actual ILS rate value

    @Override
    public String conversionText() {
        return text;
    }
//Actual ILS text


    @Override
    public double calculate(double input) {
        return input * getValue();
    }
//input number from the user to calculate
}

