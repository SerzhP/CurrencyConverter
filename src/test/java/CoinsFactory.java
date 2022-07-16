public class CoinsFactory {
    public static Coin getCoinChoice(CoinsEnum coin) {
        switch (coin) {
            case ILS:
                 return new ILS();
            case USD:
                return new USD();
        }
        return null;

//        Used to get source of conversion rate if it would be ILS or USD


    }
}