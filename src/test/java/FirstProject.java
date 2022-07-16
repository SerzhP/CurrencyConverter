import java.util.ArrayList;

public class FirstProject {
    public static void main(String[] args) {
        InterfaceScreens user = new InterfaceScreens();
        ArrayList<String>resultsList = new ArrayList<String>();
        Coin value = null;
        Results userResults;
        String fileName = "userList";

        user.welcome();
        do {
            switch (user.chooseOptions()){
                case 1:
                    value = CoinsFactory.getCoinChoice(CoinsEnum.USD);
                    break;
                case  2 :
                    value =CoinsFactory.getCoinChoice(CoinsEnum.ILS);
                    break;


            }

            double result =value.calculate(user.amountToConvert());
            String currency = value.conversionText();
            userResults = new Results(result,currency);
            resultsList.add(userResults.resultScreen());
            System.out.println(userResults.resultScreen());



        }
        while (user.startAgain());
        user.endScreen();
        System.out.println(resultsList);
        user.writeResultsTofile(resultsList,fileName);
        user.openFile(fileName);




    }


}
