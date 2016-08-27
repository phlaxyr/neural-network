package m3api.neural;

import java.util.ArrayList;
import java.util.HashMap;

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
		
	public HashMap<String, Boolean> run() {
		input.fire();
		HashMap<String, Boolean> ret = result.getResults();
		reset();
		return ret;
	}
	
	public void addLayers(int neurons, int layers) {
		for(int i = 0; i < layers; i++) {
			this.layers.add(new Layer(neurons));
		}
	}
	
	public void reset() {
		input.reset();
		result.reset();
	}
}
