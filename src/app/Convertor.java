package app;

public class Convertor {
    public static void main(String[] args) {
        double miles = 15;
        double kilometers = 30;
        convertMilesToKilometers(miles);
        convertKilometersToMiles(kilometers);
    }

    public static void convertMilesToKilometers(double miles) {
        double kilometers = miles * 1.60934;
        System.out.println(miles + " миль = " + kilometers + " километров");
    }
    public static void convertKilometersToMiles(double kilometers) {
        double miles = kilometers / 1.60934;
        System.out.println(kilometers + " километров = " + miles + " миль");
    }
}
