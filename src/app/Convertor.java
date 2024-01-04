package app;

public class Convertor {
    public static void main(String[] args) {
        double miles = 10;
        convertMilesToKilometers(miles);
    }

    public static void convertMilesToKilometers(double miles) {
        double kilometers = miles * 1.60934;
        System.out.println(miles + " миль = " + kilometers + " километров");
    }
}
