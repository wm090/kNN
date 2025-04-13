class Main {
    public static void main(String[] args) {
        NeuralNetwork neuralNetwork = new NeuralNetwork(2);

        double[] data = {1.0 , 0.5};
        

        double prediction = 0.0;
        prediction = neuralNetwork.forward(data);
        System.out.println("Prediction: " + prediction);
    }
}