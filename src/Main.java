import java.util.Scanner;

import static SimplePercentMethod.SimplePercentMethod.SimplePercentCalculator;
import static CompoundPercentMethod.CompoundPercentDailyCapitalizationMethod.CompoundPercentDailyCapitalization;
import static CompoundPercentMethod.CompoundPercentMonthlyMethod.CompoundPercentMonthlyCapitalization;
import static CompoundPercentMethod.CompoundPercentQuarterlyMethod.CompoundPercentQuarterlyCapitalization;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Select the needed calculator:
                If you need Simple Percent Calculator type: 1
                If you need Compound Interest Calculator type: 2""");

        String text = sc.nextLine();


            if (text.equals("1")) {
                System.out.print("Enter the Initial Investment: ");
                double initialInvestment = sc.nextDouble();

                System.out.print("Enter the Estimated Interest Rate: ");
                double estimatedInterestRate = sc.nextDouble();

                System.out.print("Enter the Length Of Time In Month: ");
                double lengthOfTimeInMonth = sc.nextDouble();

                System.out.print("Result: ");
                SimplePercentCalculator(initialInvestment,
                        estimatedInterestRate,
                        lengthOfTimeInMonth);
            }
            if (text.equals("2")) {

                System.out.println("""
                        Choose the periodicity of the Calculation of the Interest Rate:
                        If you need Daily Calculation type : Daily
                        If you need Monthly Calculation type : Monthly
                        If you need Quarterly Calculation type : Quarterly
                        """);

                String textInCycle = sc.nextLine();

                if (textInCycle.equals("Daily")) {
                    System.out.print("Enter the Initial Investment: ");
                    double initialInvestment = sc.nextDouble();

                    System.out.print("Enter the Estimated Interest Rate: ");
                    double estimatedInterestRate = sc.nextDouble();

                    System.out.print("Enter the Length Of Time In Days: ");
                    int lengthOfTimeInDays = sc.nextInt();

                    System.out.print("Result: ");
                    CompoundPercentDailyCapitalization(initialInvestment,
                            estimatedInterestRate,
                            lengthOfTimeInDays);
                }

                if (textInCycle.equals("Monthly")) {
                    System.out.print("Enter the Initial Investment: ");
                    double initialInvestment = sc.nextDouble();

                    System.out.print("Enter the Estimated Interest Rate: ");
                    double estimatedInterestRate = sc.nextDouble();

                    System.out.print("Enter the Length Of Time In Days: ");
                    double lengthOfTimeInDays = sc.nextInt();

                    System.out.print("Result: ");
                    CompoundPercentMonthlyCapitalization(initialInvestment,
                            estimatedInterestRate,
                            lengthOfTimeInDays);
                }


                    if (textInCycle.equals("Quarterly")) {

                        System.out.print("Enter the Initial Investment: ");
                        double initialInvestment = sc.nextDouble();

                        System.out.print("Enter the Estimated Interest Rate: ");
                        double estimatedInterestRate = sc.nextDouble();

                        System.out.print("Enter the Quarterly: ");
                        int quarterly = sc.nextInt();

                        System.out.print("Result: ");
                        CompoundPercentQuarterlyCapitalization(initialInvestment,
                                estimatedInterestRate,
                                quarterly);
                    }

                    else {
                        System.out.println("""
                                Incorrect Data!
                                Try Again!""");
                    }
            }
        }
}
