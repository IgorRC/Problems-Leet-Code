package Convert_the_temperature;

public class SolutionTemperature {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius+273.15,(celsius*1.80)+32};
    }
}
