package m3api.neural;

import java.util.ArrayList;

public class Layer {
	final ArrayList<Neuron> neurons = new ArrayList<>();
	private Layer childlayer;
	
	protected Layer() {}
	
	public Layer(int neurons) {
		for(int i = 0; i < this.neurons.size(); i++) {
			this.neurons.add(new Neuron());
		}
	}
	
	public void setChildLayer(Layer l) {
		childlayer = l;
	}
	
	public void addNeuron(Neuron n) {
		neurons.add(n);
	}
	
	public Layer childLayer() {
		if(childlayer != null)
			return childlayer;
		else
			throw new RuntimeException("No child layer set!");
	}
}
