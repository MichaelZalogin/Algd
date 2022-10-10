package javaExerсise.lambda;

import java.util.function.Function;

public class FunctionFormula {

    public static double calculate(double x) {
        return calculate(f -> x * x + 2 * x + 1, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}