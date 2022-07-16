import java.awt.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class InterfaceScreens {
    public void welcome(){
        System.out.println("Welcome to Currency Converter");
//Print welcome message for the user
    }
//    User choose between conversion rate by entering a number between 1-2.
//    The method assert that the user's input is valid and return it.
//    If the user's input is not valid, the user is notified, and he
//    will need to enter new value, until valid value is receive.
    public int chooseOptions(){
        boolean validChoise = true;
        int dollarOrShekel =0;
        System.out.println("Please choose an option  " +
                "[1]-- Dollars to Shekels " +
                "[2]-- Shekels to Dollars ");
        while (validChoise) {
            try {
                Scanner choise = new Scanner(System.in);
                dollarOrShekel = choise.nextInt();
                if (dollarOrShekel <= 2 && dollarOrShekel > 0) {
                    validChoise = false;
                } else {
                    System.out.println("Invalid Choice, please try again");
                }

            } catch (Exception a) {
                System.out.println("Invalid Choice, please try again");
            }
        }
        return dollarOrShekel;
        }

//    User choose amount to convert and check that the number is valid,if the user's input is not valid number,the user is notified, and he
//    will need to enter new value, until valid value is receive.

        public double amountToConvert() {
            Scanner convert = new Scanner(System.in);
            double amountConvert = 0;
            System.out.println("Please enter an amount to convert");
            try {
                amountConvert = convert.nextDouble();
                if (amountConvert <= 0) {
                    System.out.println("Invalid Choice, please try again");
                    amountToConvert();
                }

            } catch (Exception b) {
                System.out.println("Invalid Choice, please try again");
               amountToConvert();
            }
            return amountConvert;
        }

//         Ask the user to choose if he wants to start new conversion session or to end the session.
//         The method validate If the user's input is not valid, the user is notified, and he
//         will need to enter new value, until valid value is receive.
//         return true if user chose yes, and false if user chose no.

        public boolean startAgain() {
            Scanner startAg = new Scanner(System.in);
            String input;
            boolean yesNo = true;
            System.out.println("Do you want to calculate new value?" + " [Y] for yes" + " [N] to close");
            while (yesNo) {
                try {
                    input = startAg.next();
                    if (input.equalsIgnoreCase("y")) {
                        yesNo = true;
                        break;
                    } else if (input.equalsIgnoreCase("n")) {
                        yesNo = false;
                    } else {
                        System.out.println("Invalid Choice, please try again");
                    }

                } catch (Exception c) {
                    System.out.println(c);
                }
            }
            return yesNo;
        }
//    Print thanks message when the user choose to end the converting session
        public void endScreen(){
            System.out.println("Thanks for using my currency converter");}

    public void writeResultsTofile(ArrayList<String>results,String fileList){
        try {
            FileWriter writeList = new FileWriter(fileList);
            String result = results.toString().replace("]","");
            writeList.write(result.replace("[",""));
            writeList.close();
        }
        catch (IOException d){
            System.out.println("An error occurred");
            d.printStackTrace();

        }
        }
//    This method open the generated text file at the end of the conversion session
        public void openFile(String fileName) {
            try {
                Desktop user = Desktop.getDesktop();
                user.open(new File(fileName));
            } catch (Exception f) {
            }
        }



    }






