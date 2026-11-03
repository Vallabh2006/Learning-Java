import Helper.Temperature.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static float temperature = 0;
    public static int choice = 0;

    public static Scanner read = new Scanner(System.in);

    public static void readTemperature() {
        temperature = read.nextFloat();
    }
    public static void readChoice() {
        choice = read.nextInt();
    }

    public static void main(String[] args) {

        while(choice != 4) {
            System.out.print("\n\nFrom 1) Celsius, 2) Fahrenheit, 3) Kelvin, 4) Exit \nChoice: ");
            readChoice();

            if (!Arrays.asList(1, 2, 3, 4).contains(choice)){
                System.out.printf("Invalid Choice (%d) ", choice);
            } else {
                switch (choice) {
                    case 1:
                        System.out.print("To 1) Fahrenheit, 2) Kelvin \nChoice: ");
                        readChoice();
                        if (!Arrays.asList(1, 2).contains(choice)) {
                            System.out.printf("Invalid Choice (%d) ", choice);
                        } else {
                            if (choice == 1) {
                                System.out.print("Enter Temperature: ");
                                readTemperature();
                                System.out.printf("\n%.2f °C = %.2f F", temperature, Celsius.celsius2fahrenheit(temperature));
                            } else if (choice == 2) {
                                System.out.print("Enter Temperature: ");
                                readTemperature();
                                System.out.printf("\n%.2f °C = %.2f K", temperature, Celsius.celsius2kelvin(temperature));
                            } else {
                                System.out.print("Something went wrong (Code 1.1)");
                            }

                        }
                        break;

                    case 2:
                        System.out.print("To 1) Celsius, 2) Kelvin \nChoice: ");
                        readChoice();
                        if (!Arrays.asList(1, 2).contains(choice)) {
                            System.out.printf("Invalid Choice (%d) ", choice);
                        } else {
                            if (choice == 1) {
                                System.out.print("Enter Temperature: ");
                                readTemperature();
                                System.out.printf("\n%.2f F = %.2f °C", temperature, Fahrenheit.fahrenheit2celsius(temperature));
                            } else if (choice == 2) {
                                System.out.print("Enter Temperature: ");
                                readTemperature();
                                System.out.printf("\n%.2f F = %.2f K", temperature, Fahrenheit.fahrenheit2kelvin(temperature));
                            } else {
                                System.out.print("Something went wrong (Code 2.1)");
                            }

                        }
                        break;

                    case 3:
                        System.out.print("To 1) Celsius, 2) Fahrenheit \nChoice: ");
                        readChoice();
                        if (!Arrays.asList(1, 2).contains(choice)) {
                            System.out.printf("Invalid Choice (%d) ", choice);
                        } else {
                            if (choice == 1) {
                                System.out.print("Enter Temperature: ");
                                readTemperature();
                                System.out.printf("\n%.2f K = %.2f °C", temperature, Kelvin.kelvin2celsius(temperature));
                            } else if (choice == 2) {
                                System.out.print("Enter Temperature: ");
                                readTemperature();
                                System.out.printf("\n%.2f K = %.2f F", temperature, Kelvin.kelvin2fahrenheit(temperature));
                            } else {
                                System.out.print("Something went wrong (Code 3.1)");
                            }

                        }
                        break;
                    case 4:
                        System.out.print("\nExiting...");
                        return;
                    default:
                        System.out.printf("\nInvalid Choice %d\n", choice);
                }
                choice = 0;
            }
        }
    }

}
