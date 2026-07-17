public class FinancialForecastOpt1 {
     public static double forecast(double value, double growthRate, int periods) {

        double result = value;

        for (int i = 0; i < periods; i++) {
            result = result * (1 + growthRate);
        }

        return result;
    }
}
