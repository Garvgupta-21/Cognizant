public class FinancialForecastOpt2 {
     public static double forecast(double value, double growthRate, int periods) {

        return value * Math.pow(1 + growthRate, periods);
    }
}
