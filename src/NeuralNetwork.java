// NeuralNetwork class for neural network. It has hidden neurons and output neuron.
public class NeuralNetwork {
    
    // hidden neurons
    Neuron hiddenNeuron1;
    Neuron hiddenNeuron2;
    // output neuron
    Neuron outputNeuron;

    // default constructor for setWeights
    public NeuralNetwork(){
        // manual weights
        hiddenNeuron1 = new Neuron();
        hiddenNeuron2 = new Neuron();
        // takes as much inputs as hidden neurons are there
        outputNeuron = new Neuron();
    }


    // constructor for neural network
    public NeuralNetwork(int inputSize) {

        // random weights
        hiddenNeuron1 = new Neuron(inputSize);
        hiddenNeuron2 = new Neuron(inputSize);

        outputNeuron = new Neuron(2);

    }

    // forward propagation
    public double forward(double[] input) {
        // hidden neurons
        double out1 = hiddenNeuron1.activate(input);
        double out2 = hiddenNeuron2.activate(input);

        double[] hiddenoutputs = {out1, out2};
        // output neuron
        double output = outputNeuron.activate(hiddenoutputs);

        return output;

    }
}

