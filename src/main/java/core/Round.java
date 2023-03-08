package core;

public class Round {
    public double round(double value, int round) {
        double coeff = Math.pow(10, round);
        return Math.round(value * coeff) / coeff;
    }
}
