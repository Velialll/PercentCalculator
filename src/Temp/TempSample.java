package Temp;

public class TempSample {
    public static void main(String[] args) {

        double money = 350000;
        double percent = 4.7;
        int days = 273;
        int quarterly = 3;
        int numberOfOperation = days / 30;

        CompoundPercentDailyCapitalization(money,percent,days);
        CompoundPercentMonthlyCapitalization(money,percent,numberOfOperation);
        CompoundPercentQuarterlyCapitalization(money,percent,quarterly);
    }

    static void CompoundPercentDailyCapitalization(double money,
                                                   double percent,
                                                   int days){

        double result =money * Math.pow(1 + ((percent / 100) / 365 ), days);
        System.out.println("Compound percent Daily Capitalization = " + result);
    }
    static void CompoundPercentMonthlyCapitalization(double money,
                                                     double percent,
                                                     int numberOfOperation){

        double result = money  * Math.pow(1 + ((percent / 100) / 12), numberOfOperation);
        System.out.println("Compound percent Monthly Capitalization = " + result);
    }

    static void CompoundPercentQuarterlyCapitalization(double money,
                                                       double percent,
                                                       int quarterly){

        double result = money  * Math.pow(1 + ((percent / 100) / 4), quarterly);
        System.out.println("Compound percent Quarterly Capitalization = " + result);
    }
}