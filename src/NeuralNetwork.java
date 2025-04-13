public class NeuralNetwork {

    Neuron hiddenNeuron1;
    Neuron hiddenNeuron2;
    Neuron outputNeuron;

    public NeuralNetwork(int inputSize) {
        //hiddenNeuron1 = new Neuron(inputSize);
        //hiddenNeuron2 = new Neuron(inputSize);
        //outputNeuron = new Neuron(2);
        
        hiddenNeuron1 = new Neuron();
        hiddenNeuron1.setWeights(new double[]{0.5, 0.3}, 0.2);
        hiddenNeuron2 = new Neuron();  
        hiddenNeuron2.setWeights(new double[]{0.3, 0.2}, -0.5);

        outputNeuron = new Neuron();
        outputNeuron.setWeights(new double[]{0.9, 0.2}, -0.8);
    }

    public double forward(double[] input) {
        double out1 = hiddenNeuron1.activate(input);
        double out2 = hiddenNeuron2.activate(input);
        double[] hiddenoutputs = {out1, out2};
        double output = outputNeuron.activate(hiddenoutputs);
        return output;
    }
}

