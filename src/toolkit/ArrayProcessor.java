package toolkit;

import java.util.Random;
import vehicle.Car;

public class ArrayProcessor {

    private static int eventsProcessed = 0;

    public static int getEventsProcessed() {
        eventsProcessed++;
        return eventsProcessed;
    }//end of getEventsProcessed
    public static int[] createArrayWithInts(int sizeOfArray, int min, int max){
        eventsProcessed++;

        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        return array;


    }//end of createArrayWithInts
    public static void displayElementsOfIntArray(int[] array){
        eventsProcessed++;
        System.out.println("===============================================");
        System.out.println("displayElementsOfIntArray");
        System.out.println("===============================================");
        for(int i = 0; i < array.length; i++) {
            if(i < array.length -1){
                System.out.print(array[i] + ", ");
            }else{
                System.out.println(array[i]);
            }
        }

    }//end of displayElementsOfIntArray
    public static double averageOfIntArray(int[] array){
        eventsProcessed++;

        double sum = 0;
        for (int j : array) {
            sum += j;
        }

        double average = (double) sum / array.length;


        return average;

    }//end of averageOfIntArray
    public static void findCarWithBestMPG(Car[] cars){
        eventsProcessed++;
        double bestMpg = Double.MIN_VALUE;
        System.out.println("===============================================");
        System.out.println("findCarWithBestMPG");
        System.out.println("===============================================");

        for (Car car : cars) {
            if (car.getMpg() > bestMpg) {
                bestMpg = car.getMpg();
            }
        }

        for (Car car : cars) {
            if (car.getMpg() == bestMpg) {
                car.displayInfo();
            }
        }
    }//end of findCarWithBestMPG

    public static void findCarWithWorstMPG(Car[] cars) {
        eventsProcessed++;
        double worstMpg = Double.MAX_VALUE;
        System.out.println("===============================================");
        System.out.println("findCarWithWorstMPG");
        System.out.println("===============================================");

        for (Car car : cars) {
            if (car.getMpg() < worstMpg) {
                worstMpg = car.getMpg();
            }
        }

        for (Car car : cars) {
            if (car.getMpg() == worstMpg) {
                car.displayInfo();
            }
        }
    }// end of findCarWithWorstMPG

    public static double averageOfCarPrices(Car[] cars) {
        eventsProcessed++;

        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }

        double average = sum / cars.length;

        return average;
    }//end of averageOfCarPrices

}//end of ArrayProcessor