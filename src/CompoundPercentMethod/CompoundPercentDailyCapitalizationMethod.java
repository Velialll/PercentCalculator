package CompoundPercentMethod;

public class CompoundPercentDailyCapitalizationMethod {
   public static void CompoundPercentDailyCapitalization(double initialInvestment,
                                                         double estimatedInterestRate,
                                                         int lengthOfTimeInDays) {

        double result = initialInvestment * Math.pow(1 + ((estimatedInterestRate / 100) / 365), lengthOfTimeInDays);
        System.out.printf("%.2f",result);
    }
}
