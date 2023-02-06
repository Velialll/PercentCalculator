package CompoundPercentMethod;

public class CompoundPercentQuarterlyMethod {
    public static void CompoundPercentQuarterlyCapitalization(double initialInvestment,
                                                              double estimatedInterestRate,
                                                              int quarterly) {

        double result = initialInvestment * Math.pow(1 + ((estimatedInterestRate / 100) / 4), quarterly);
        System.out.printf("%.2f",result);
    }
}
