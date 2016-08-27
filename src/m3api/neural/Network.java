package m3api.neural;

import java.util.ArrayList;

public class Network {
	InputLayer input = new InputLayer();
	ArrayList<Layer> layers = new ArrayList<>();
	ResultLayer result = new ResultLayer();
	
	public void addInput(String inputname) {
		input.addNeuron(inputname);
	}
	
	public void addResult(String resultname) {
		result.addNeuron(resultname);
	}
	
	public void addLayers(int neurons, int layers) {
		for(int i = 0; i < layers; i++) {
			this.layers.add(new Layer(neurons));
		}
	}
}
