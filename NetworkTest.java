import layer.LayerType;
import layer.NeuralNetworkLayerConfig;

/**
 * Created by amigo on 20/1/2017.
 */
public class NetworkTest {

    public static void main(String[] args) {
        NeuralNetwork nn = new NeuralNetwork();
        NeuralNetworkLayerConfig c = new NeuralNetworkLayerConfig();
        c.layerType = LayerType.CONVOLUTIONAL;
        c.kernelShape[0] = 28;
        c.kernelShape[1] = 28;
        c.kernelShape[2] = 3;
        c.kernelShape[3] = 0;
        nn.layerConfigs.add(c);
    }
}
