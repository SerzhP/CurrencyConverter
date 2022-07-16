public class USD extends Coin{
   private final double value = 3.52;
    private final String text = "  USD to ILS";

//    Actual USD rate value


    @Override
    public double getValue() {
        return value;

    }

    @Override
    public String conversionText() {
        return text;
    }
    //Actual USD text
    @Override
    public double calculate(double input) {
        return input * getValue();
    }
    //input number from the user to calculate
}
