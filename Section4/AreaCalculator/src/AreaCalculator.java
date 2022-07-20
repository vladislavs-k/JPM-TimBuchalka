public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0){
            return -1d;
        }
        return Math.pow(radius,2) * Math.PI;
    }

    public static double area(double a, double b){
        if (a < 0 || b < 0){
            return -1d;
        }
        return a * b;
    }

}