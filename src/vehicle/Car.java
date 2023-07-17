package vehicle;

import java.util.Random;

public class Car {
    private static final String VIN = "VIN-";
    private static int carID = 1000;
    private static String[] colors = {"White", "Red", "Blue", "Green", "Black"};
    private static int minMPG = 10;
    private static int maxMPG = 50;
    private static int minPrice = 25000;
    private static int maxPrice = 65000;
    private String vin;
    private String color;
    private double mpg;
    private double price;

    public Car(){
        Random random = new Random();

        // Incrementing carID for the next instance
        carID++;

        // Assigning random color from the colors array
        color = colors[random.nextInt(colors.length)];

        // Generating random mpg within the range (MIN_MPG, MAX_MPG)
        mpg = minMPG + (maxMPG - minMPG) * random.nextDouble();

        // Generating random price within the range (MIN_MPG, MAX_MPG)
        price = minPrice + (maxPrice - minPrice) * random.nextDouble();

        // Assigning VIN with carID
        vin = VIN + carID;

    }//end of Car constructor
    public static String[] getColors(){
        return colors;
    }//end of getColors
    public static int getMinMPG(){
        return minMPG;
    }//end of getMinMPG
    public static int getMaxMPG(){
        return maxMPG;
    }//end of getMaxMPG
    public static int getMinPrice(){
        return minPrice;
    }//end of getMinPrice
    public static int getMaxPrice(){
        return maxPrice;
    }//end of getMaxPrice
    public String getVin(){
        return vin;
    }//end of getVin
    public String getColor(){
        return color;
    }//end of getColor
    public double getMpg(){
        return mpg;
    }//end of getMPG
    public double getPrice(){
        return price;
    }//end of getPrice
    public void setColor(String color){
        this.color = color;
    }//end of setColor
    public void setMPG(double mpg){
        this.mpg = mpg;
    }//end of setMPG
    public void setPrice(double price){
        this.price = price;
    }//end of setPrice
    public void displayInfo(){
        System.out.printf("VIN: %-10s Color: %-10s Price: %-10.2f MPG: %-10.2f\n", vin, color, price, mpg);
    }//end of displayInfo

}//end of Car
