package SimplePercentMethod;

public class SimplePercentMethod {
    public static void SimplePercentCalculator(double initialInvestment,
                                               double estimatedInterestRate,
                                               double lengthOfTimeInMonth) {

        estimatedInterestRate /= 100.0;
        lengthOfTimeInMonth /= 12.0;
        double amountReceived = initialInvestment * (1.0 + estimatedInterestRate * lengthOfTimeInMonth);
        System.out.printf("%.2f" ,amountReceived);
    }
}
