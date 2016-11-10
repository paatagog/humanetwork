package function;

/**
 * Created by amigo on 10/11/2016.
 */
public class Signum implements Function {

    @Override
    public double get(double x) {
        return Math.signum(x);
    }

    @Override
    public double getDerivative(double x) {
        return 0;
    }
}
