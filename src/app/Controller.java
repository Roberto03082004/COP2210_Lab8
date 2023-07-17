package app;

import vehicle.Car;
import toolkit.ArrayProcessor;
public class Controller {

    public static void main(String[] args){
        yourInfoHeader();


        // Step 1: Generate five arrays of integers
        for (int i = 0; i < 5; i++) {
            int[] array = ArrayProcessor.createArrayWithInts(10, -100, 1000);

            // Display the array
            ArrayProcessor.displayElementsOfIntArray(array);

            // Calculate the average of the array
            double average = ArrayProcessor.averageOfIntArray(array);
            System.out.println("Average of the array: " + average);
        }

        System.out.println();
        Car[] cars = new Car[14];

        // Create 14 cars and store them in the cars array
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }

        // Display information for each car in the cars array
        for (Car car : cars) {
            car.displayInfo();
        }

        System.out.println();
        // Find the car with th best MPG
        ArrayProcessor.findCarWithBestMPG(cars);


        // Find the car with the worst MPG
        ArrayProcessor.findCarWithWorstMPG(cars);

        System.out.println();
        // Display the average car price using printf
        System.out.printf("Car Average Price: $%-10.2f\n", ArrayProcessor.averageOfCarPrices(cars));

        // Print the separator and header for 2D arrays
        System.out.println();
        System.out.println("======================================");
        System.out.println("2D Arrays");
        System.out.println("======================================");

        // Create a two-dimensional array of integers
        int[][] arrayWithinArrayOfInts = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4}
        };
        // Print the elements of the array
        for (int[] withinArrayOfInt : arrayWithinArrayOfInts) {
            System.out.print("{");
            for (int j = 0; j < withinArrayOfInt.length; j++) {
                System.out.print(withinArrayOfInt[j]);
                if (j < withinArrayOfInt.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
        System.out.println();
        // Print each entry of the array along with its average
        for (int[] arrayWithinArrayOfInt : arrayWithinArrayOfInts) {
            System.out.print("{ ");
            for (int i : arrayWithinArrayOfInt) {
                System.out.print(i + " ");
            }
            double average = ArrayProcessor.averageOfIntArray(arrayWithinArrayOfInt);
            System.out.printf("} Average of Array Entry: %.1f\n", average);
        }
        // Print the separator and header for ArrayProcessor events
        System.out.println();
        System.out.println("======================================");
        System.out.println("ArrayProcessor Events");
        System.out.println("======================================");

        // Print the value of ArrayProcessor's eventsProcessed variable
        int eventsProcessed = ArrayProcessor.getEventsProcessed();
        System.out.println("ArrayProcessor Events: " + eventsProcessed);

    }//end of main



























    public static void yourInfoHeader(){
        System.out.println("================================");
        System.out.println("PROGRAMMER:  " + "Roberto Callejas");
        System.out.println("PANTHER ID:  " + "6360177");
        System.out.println();
        System.out.println("CLASS \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U02C");
        System.out.println("SEMESTER: \t " + "Summer 2023");
        System.out.println("CLASS TIME: \t " + "10:00 AM - 12:50 PM");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 8");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================");
        System.out.println();

    }//end of yourInfoHeader
}
