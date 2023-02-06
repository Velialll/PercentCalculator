package CompoundPercentMethod;

public class CompoundPercentMonthlyMethod {
    public static void CompoundPercentMonthlyCapitalization(double initialInvestment,
                                                            double estimatedInterestRate,
                                                            double lengthOfTimeInDays) {

        double numberOfOperation2 = lengthOfTimeInDays / 30;
        double result = initialInvestment * Math.pow(1 + ((estimatedInterestRate / 100) / 12), numberOfOperation2);
        System.out.printf("%.2f",result);
    }
}
