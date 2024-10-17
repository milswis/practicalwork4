public class Main {
    static double a = 2;
    static double b = 5;

    public static double f(double x) {
        if (x >= 1 && x < 3) {
            return 9 / (a * x);
        } else if (x == 3) {
            return 9 / (a * x * x + x + b);
        } else {
            throw new IllegalArgumentException("Значение x не в допустимом диапазоне");
        }
    }

    public static void main(String[] args) {
        double[] xValues = {1, 2, 3};

        for (double x : xValues) {
            try {
                System.out.println("f(" + x + ") = " + f(x));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}