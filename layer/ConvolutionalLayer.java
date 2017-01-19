package layer;

/**
 * Created by amigo on 10/11/2016.
 */
public class ConvolutionalLayer extends NeuralNetworkLayer {

    public int inputHeight;
    public int inputWidth;
    public int inputDepth;
    public int kernelWidth;
    public int kernelHeight;
    public int kernelNumber;

    // filter number, depth, width, height
    private double[][][][] kernels;

    public void init() {
        kernels = new double[kernelNumber][inputDepth][kernelWidth][kernelHeight];
    }


}
