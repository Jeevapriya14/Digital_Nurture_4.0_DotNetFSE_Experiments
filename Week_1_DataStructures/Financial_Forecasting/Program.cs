using System;

class Program
{
    static double PredictFutureValue(double presentValue, double rate, int years)
    {
        if (years == 0)
            return presentValue;

        return (1 + rate) * PredictFutureValue(presentValue, rate, years - 1);
    }

    static void Main()
    {
        double presentValue = 10000; 
        double annualGrowthRate = 0.08; 
        int years = 5;

        double futureValue = PredictFutureValue(presentValue, annualGrowthRate, years);

        Console.WriteLine($"Predicted Future Value after {years} years: ₹{futureValue:F2}");
    }
}
