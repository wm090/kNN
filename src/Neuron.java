import java.util.Arrays;

class Neuron {
    private double[] weights;

    public Neuron(int inputSize){
        // +1 for bias weight
        weights = new double[inputSize + 1];
        for(int i = 0; i < inputSize + 1; i++){
            weights[i] = Math.random() * 2 - 1;
        }
    }

    public double setWeights(double[] inputs){
        
        for(int i = 0; i < inputs.length; i++){
            weights[i] = inputs[i];
        }
        return 0.0;
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