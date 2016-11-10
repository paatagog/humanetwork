package layer;

/**
 * Created by amigo on 10/11/2016.
 */
public class ConvolutionalLayer {

    private int inputHeight;
    private int inputWidth;
    private int inputDepth;
    private int kernelWidth;
    private int kernelHeight;
    private int kernelNumber;

    // filter number, depth, width, height
    private double[][][][] kernels;

    public void init() {
        kernels = new double[kernelNumber][inputDepth][kernelWidth][kernelHeight];
    }

    public int getInputHeight() {
        return inputHeight;
    }

    public void setInputHeight(int inputHeight) {
        this.inputHeight = inputHeight;
    }

    public int getInputWidth() {
        return inputWidth;
    }

    public void setInputWidth(int inputWidth) {
        this.inputWidth = inputWidth;
    }

    public int getInputDepth() {
        return inputDepth;
    }

    public void setInputDepth(int inputDepth) {
        this.inputDepth = inputDepth;
    }

    public int getKernelWidth() {
        return kernelWidth;
    }

    public void setKernelWidth(int kernelWidth) {
        this.kernelWidth = kernelWidth;
    }

    public int getKernelHeight() {
        return kernelHeight;
    }

    public void setKernelHeight(int kernelHeight) {
        this.kernelHeight = kernelHeight;
    }

    public int getKernelNumber() {
        return kernelNumber;
    }

    public void setKernelNumber(int kernelNumber) {
        this.kernelNumber = kernelNumber;
    }
}
