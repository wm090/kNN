// Main class for testing neural network. It has main method.
public class Main {
    public static void main(String[] args) {
        
        // neural network with random weights
        NeuralNetwork neuralNetwork = new NeuralNetwork(3);

        // neural network with manual weights.
        NeuralNetwork neuralNetwork2 = new NeuralNetwork();
        
        neuralNetwork2.hiddenNeuron1.setWeights(new double[]{0.5, 0.3}, 0.2);
        neuralNetwork2.hiddenNeuron2.setWeights(new double[]{0.3, 0.2}, -0.5);
        // output Neuron input can be modified here based on hidden neurons.
        neuralNetwork2.outputNeuron.setWeights(new double[]{0.9, 0.2}, -0.8);

        // data
        double[] data = {1.0 , 0.5, -0.9};
        
        // prediction - random weights
        double prediction = 0.0;
        prediction = neuralNetwork.forward(data);
        System.out.println("Prediction with random weights: " + prediction);

        System.out.println("--------------------------------------------------");

        double[] data2 = {1.0 , 0.5};
        // prediction2 - manual weights
        double prediction2 = 0.0;
        prediction2 = neuralNetwork2.forward(data2);
        System.out.println("Prediction with manual weights: " + prediction2);
    }
}
