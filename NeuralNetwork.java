import layer.NeuralNetworkLayer;
import layer.NeuralNetworkLayerConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amigo on 10/11/2016.
 * პირველი განზომილებაა x
 * მეორე განზომილებაა y
 * მესამე განზომილებაა ფერის არხი
 * მეოთხე განზომილებაა ნაკვთის ნომერი (ანუ წინა დონის შრის ნომერი)
 *
 */
public class NeuralNetwork {
    public List<NeuralNetworkLayerConfig> layerConfigs = new ArrayList<>();
    public List<NeuralNetworkLayer> layers = new ArrayList<>();

    public void learn(double[][][] x, double[] d) {

    }

    public double[] recognize(double[][][] x) {
        double[] y = new double[5];
        return y;
    }


}
