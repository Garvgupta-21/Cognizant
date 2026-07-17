public class FinancialForecast {

    public static double forecast(double value, double growthRate, int periods) {

        // base case
        if (periods == 0) {
            return value;
        }

        // recursive case
        return forecast(value, growthRate, periods - 1) * (1 + growthRate);
    }
}