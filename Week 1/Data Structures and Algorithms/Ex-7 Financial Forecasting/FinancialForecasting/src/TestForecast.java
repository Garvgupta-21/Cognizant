public class TestForecast {

    public static void main(String[] args) {

        double initialValue = 1000;
        double growthRate = 0.10; // 10%
        int periods = 5;

        double result = FinancialForecast.forecast(initialValue, growthRate, periods);

        System.out.println("Future Value: " + result);
    }
}