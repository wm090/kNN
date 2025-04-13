import java.util.Arrays;

public class Neuron {
    private double[] weights;

    public Neuron(){

        // set Neuron(int inputSize)
        // random weights
        // +1 for bias weight
        //weights = new double[inputSize + 1];
        //for(int i = 0; i < inputSize + 1; i++){
          //  weights[i] = Math.random() * 2 - 1;
        //}
    }

    public void setWeights(double[] inputs, double biasWeight){
        weights = new double[inputs.length + 1];

        for(int i = 0; i < inputs.length; i++){
            weights[i] = inputs[i];
        }
        weights[inputs.length] = biasWeight;
        
    }

    public double activate(double[] inputs){
        double sum = 0.0;
        for(int i = 0; i < inputs.length; i++){
            sum += weights[i] * inputs[i];
        }
       
        sum += weights[inputs.length] * 1.0; 
        return 1 / (1 + Math.exp(-sum)); // sigmoid
    }

    public String toString(){
        return "Weights: " + Arrays.toString(weights);
    }
}