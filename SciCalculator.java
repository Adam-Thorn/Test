import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        // Initializes the variables
        int userNum; // user input
        String operandA; // first number entered
        String operandB; // second number entered
        double resultValue; //result of current calculation
        double sumValue; // sum of all calculations
        double calcNum; //number of calculations done
        double avgCalc; // average of all calculations done
        String storedValue;
        boolean calcOn;
        boolean equationOn;

        //Sets up the original values of variables
        resultValue = 0;
        sumValue = 0;
        calcNum = 0;
        avgCalc = 0;
        storedValue = "RESULT";
        calcOn = true;
        equationOn = false;

        //Creates the calculator on load up and on loops
        while (calcOn == true) {
            //Allows the stats to be added up if a calculation has been made
            // if not it will skip this part
            if (equationOn == true){
                sumValue = sumValue + resultValue;
                calcNum = calcNum + 1;
                avgCalc = sumValue / calcNum;
            }
            System.out.println("Current Result: " + resultValue);
            System.out.println();

            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println();

            System.out.print("Enter Menu Selection: ");
            userNum = scnr.nextInt();
            equationOn = true;

            //Creates the user input and calculation set up, with a loop if needed
            //for a invalid menu selection or showing stats before any calculations have been made
            while (equationOn == true) {
                //Creates the addition menu
                if (userNum == 1) {
                    System.out.print("Enter first operand: ");
                    operandA = scnr.next();
                    System.out.print("Enter second operand: ");
                    operandB = scnr.next();
                    System.out.println();

                    //Allows result to input
                    if ((operandA.equals(storedValue)) && !(operandB.equals(storedValue))) {
                        resultValue = Double.parseDouble(operandB) + resultValue;
                    }
                    else if ((operandB.equals(storedValue)) && !(operandA.equals(storedValue))) {
                        resultValue = resultValue + Double.parseDouble(operandA);
                    }
                    else if ((operandA.equals(storedValue)) && (operandB.equals(storedValue))) {
                        resultValue = resultValue + resultValue;
                    }
                    else {
                        resultValue = Double.parseDouble(operandA) + Double.parseDouble(operandB);
                    }

                    equationOn = false;
                }
                //Creates the subtraction menu
                else if (userNum == 2) {
                    System.out.print("Enter first operand: ");
                    operandA = scnr.next();
                    System.out.print("Enter second operand: ");
                    operandB = scnr.next();
                    System.out.println();

                    //Allows result to input
                    if ((operandA.equals(storedValue)) && !(operandB.equals(storedValue))) {
                        resultValue = resultValue - Double.parseDouble(operandB);
                    }
                    else if ((operandB.equals(storedValue)) && !(operandA.equals(storedValue))) {
                        resultValue = Double.parseDouble(operandA) - resultValue;
                    }
                    else if ((operandA.equals(storedValue)) && (operandB.equals(storedValue))) {
                        resultValue = resultValue - resultValue;
                    }
                    else {
                        resultValue = Double.parseDouble(operandA) - Double.parseDouble(operandB);
                    }

                    equationOn = false;
                }
                //Creates the multiplication menu
                else if (userNum == 3) {
                    System.out.print("Enter first operand: ");
                    operandA = scnr.next();
                    System.out.print("Enter second operand: ");
                    operandB = scnr.next();
                    System.out.println();

                    //Allows result to input
                    if ((operandA.equals(storedValue)) && !(operandB.equals(storedValue))) {
                        resultValue = Double.parseDouble(operandB) * resultValue;
                    }
                    else if ((operandB.equals(storedValue)) && !(operandA.equals(storedValue))) {
                        resultValue = resultValue * Double.parseDouble(operandA);
                    }
                    else if ((operandA.equals(storedValue)) && (operandB.equals(storedValue))) {
                        resultValue = resultValue * resultValue;
                    }
                    else {
                        resultValue = Double.parseDouble(operandA) * Double.parseDouble(operandB);
                    }

                    equationOn = false;
                }
                //Creates the division menu
                else if (userNum == 4) {
                    System.out.print("Enter first operand: ");
                    operandA = scnr.next();
                    System.out.print("Enter second operand: ");
                    operandB = scnr.next();
                    System.out.println();

                    //Allows result to input
                    if ((operandA.equals(storedValue)) && !(operandB.equals(storedValue))) {
                        resultValue = resultValue / Double.parseDouble(operandB);
                    }
                    else if ((operandB.equals(storedValue)) && !(operandA.equals(storedValue))) {
                        resultValue = Double.parseDouble(operandA) / resultValue;
                    }
                    else if ((operandA.equals(storedValue)) && (operandB.equals(storedValue))) {
                        resultValue = resultValue / resultValue;
                    }
                    else {
                        resultValue = Double.parseDouble(operandA) / Double.parseDouble(operandB);
                    }

                    equationOn = false;
                }
                //Creates the exponentiation menu
                else if (userNum == 5) {
                    System.out.print("Enter first operand: ");
                    operandA = scnr.next();
                    System.out.print("Enter second operand: ");
                    operandB = scnr.next();
                    System.out.println();

                    //Allows result to input
                    if ((operandA.equals(storedValue)) && !(operandB.equals(storedValue))) {
                        resultValue = Math.pow(resultValue, Double.parseDouble(operandB));
                    }
                    else if ((operandB.equals(storedValue)) && !(operandA.equals(storedValue))) {
                        resultValue = Math.pow(Double.parseDouble(operandA), resultValue);
                    }
                    else if ((operandA.equals(storedValue)) && (operandB.equals(storedValue))) {
                        resultValue = Math.pow(resultValue, resultValue);
                    }
                    else {
                        resultValue = Math.pow(Double.parseDouble(operandA), Double.parseDouble(operandB));
                    }

                    equationOn = false;
                }
                //Creates the logarithm menu
                else if (userNum == 6) {
                    System.out.print("Enter first operand: ");
                    operandA = scnr.next();
                    System.out.print("Enter second operand: ");
                    operandB = scnr.next();
                    System.out.println();

                    //Allows result to input
                    if ((operandA.equals(storedValue)) && !(operandB.equals(storedValue))) {
                        resultValue = Math.log(Double.parseDouble((operandB))) / Math.log(resultValue);
                    }
                    else if ((operandB.equals(storedValue)) && !(operandA.equals(storedValue))) {
                        resultValue = Math.log(resultValue) / Math.log(Double.parseDouble(operandA));
                    }
                    else if ((operandA.equals(storedValue)) && (operandB.equals(storedValue))) {
                        resultValue = Math.log(resultValue) / Math.log(resultValue);
                    }
                    else {
                        resultValue = Math.log(Double.parseDouble((operandB))) / Math.log(Double.parseDouble((operandA)));
                    }
                    equationOn = false;
                }
                //Creates the stat screen
                else if (userNum == 7) {
                    if (calcNum == 0) {
                        System.out.println();
                        System.out.println("Error: No calculations yet to average!");
                        System.out.println();

                        System.out.print("Enter Menu Selection: ");
                        userNum = scnr.nextInt();
                        equationOn = true;

                    } else {
                        //Author: Ankit
                        //Date: 5/31/2019
                        //Availability: Stackoverflow
                        int avgValue = (int) Math.round(avgCalc * 100);
                        double accValue = avgValue / 100.0;

                        System.out.println();
                        System.out.println("Sum of calculations: " + sumValue);
                        System.out.println("Number of calculations: " + Math.round(calcNum));
                        System.out.println("Average of calculations: " + accValue);
                        System.out.println();

                        System.out.print("Enter Menu Selection: ");
                        userNum = scnr.nextInt();
                        equationOn = true;
                    }
                }
                //Ends the program
                else if (userNum == 0){
                    System.out.println();
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    calcOn = false;
                    break;
                }
                //Shows an error because of an invalid selection
                else {
                    System.out.println();
                    System.out.println("Error: Invalid selection!");
                    System.out.println();

                    System.out.print("Enter Menu Selection: ");
                    userNum = scnr.nextInt();
                    equationOn = true;

                }
            }
            equationOn = true;
        }
    }
}