// Neuron class for neural network. It has weights and activation function.
import java.util.Arrays;

public class Neuron {
    // weights of neuron as array of doubles. Last index is bias weight.
    double[] weights;

    // default constructor for setWeights
    public Neuron(){}

    // constructor for random weights
    public Neuron(int inputSize){
        // random weights
        // +1 for bias weight
        weights = new double[inputSize + 1];
        for(int i = 0; i < inputSize + 1; i++){
            weights[i] = Math.random() * 2 - 1;
        }
    }

    // set weights for neuron manually
    public void setWeights(double[] inputs, double biasWeight){
        weights = new double[inputs.length + 1];

        for(int i = 0; i < inputs.length; i++){
            weights[i] = inputs[i];
        }
        // bias weight
        weights[inputs.length] = biasWeight;
        
    }

    // activate neuron with sigmoid function and return output value
    public double activate(double[] inputs){
        double sum = 0.0;
        for(int i = 0; i < inputs.length; i++){
            sum += weights[i] * inputs[i];
        }
       
        sum += weights[inputs.length] * 1.0; 
        return 1 / (1 + Math.exp(-sum)); // sigmoid
    }

    // print weights of neuron as string for debugging purposes.
    public String toString(){
        return "Weights: " + Arrays.toString(weights);
    }
}