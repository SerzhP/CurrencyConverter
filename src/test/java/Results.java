public class Results {
    private double result;
    private String currency;

//    result the result of the calculated currency

public Results(double result, String currency){
    setResult(result);
    setCurrency(currency);
}

public double getResult(){
    return result;
}
private void setResult(double result){
    this.result = result;
}
private String getCurrency(){
    return currency;
}
public void setCurrency(String currency){
    this.currency = currency;
}
public String resultScreen(){
String results = Double.toString(getResult());
return results + getCurrency();
}
//return generated string that contains the calculated currency
//and the text that explain from what to what we convert the currency
}