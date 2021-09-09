import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        while (true){
            //gets the operation
            System.out.println("Enter the operation.");
            Scanner newScanner = new Scanner(System.in);

            String optionSelected = newScanner.nextLine();

            //gets numbers to use
            try {
                System.out.print("Enter the first number: ");
                int firstNumber = newScanner.nextInt();
                System.out.print("Enter the second number: ");
                int secondNumber = newScanner.nextInt();
                doOperation(optionSelected, firstNumber, secondNumber);
            }
            catch (Exception error){
                System.out.println("Make sure to enter numbers.");
            }


        }
    }
    public static void doOperation(String optionSelected, int firstNumber, int secondNumber){
        //calls the function based on the option that the user gave
        Calculator calculatorObject = new Calculator();
        Map<String, Runnable> validOptions = new HashMap<>();
        validOptions.put("add", () -> System.out.println(calculatorObject.add(firstNumber, secondNumber)));
        validOptions.put("subtract", () -> System.out.println(calculatorObject.subtract(firstNumber, secondNumber)));
        validOptions.put("divide", () -> System.out.println(calculatorObject.divide(firstNumber, secondNumber)));
        validOptions.put("multiply", () -> System.out.println(calculatorObject.multiply(firstNumber, secondNumber)));
        validOptions.get(optionSelected).run();
            
    }
}

class Calculator {
    //contains the functions for math
    public static int add(int firstNumber, int secondNumber){
        //returns the two numbers added
       return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber){
        //returns the two numbers subtracted
        return firstNumber - secondNumber;
    }

    public static int divide(int firstNumber, int secondNumber){
        //returns the two numbers divided
        return firstNumber / secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber){
        //returns the two numbers multiplied
        return firstNumber * secondNumber;
    }
}
