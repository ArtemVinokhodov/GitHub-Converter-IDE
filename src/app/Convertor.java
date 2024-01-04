package app;

public class Convertor {
    public static void main(String[] args) {
        double kilometers = 20;
        convertKilometersToMiles(kilometers);
    }

    public static void convertKilometersToMiles(double kilometers) {
        double miles = kilometers / 1.60934;
        System.out.println(kilometers + " километров = " + miles + " миль");
    }
}
