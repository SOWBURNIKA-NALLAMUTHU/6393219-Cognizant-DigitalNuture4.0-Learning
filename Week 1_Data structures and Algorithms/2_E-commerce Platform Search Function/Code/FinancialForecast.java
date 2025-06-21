
public class FinancialForecast {

    /**
     * Recursively predicts the future value based on current value, growth rate, and years.
     *
     * @param currentValue the current financial amount
     * @param growthRate   the annual growth rate (e.g., 0.05 for 5%)
     * @param years        the number of years into the future
     * @return the predicted future value
     */
    public double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue; 
        }
        double updatedValue = currentValue * (1 + growthRate); 
        return predictFutureValue(updatedValue, growthRate, years - 1); 
    }

    public static void main(String[] args) {
        
        double initialValue = 2000.0;
        double growthRate = 0.07; 
        int years = 2;

        FinancialForecast forecastTool = new FinancialForecast();

        double predictedValue = forecastTool.predictFutureValue(initialValue, growthRate, years);

        System.out.println("Initial Value: $" + initialValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.printf("Predicted Future Value: $%.3f%n", predictedValue);
    }
}
