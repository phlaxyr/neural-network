package m3api.neural;

import java.util.ArrayList;

public class Neuron {
	
	public final ArrayList<Neuron> tofire = new ArrayList<>();
	
	public void fire() {
		for(Neuron n : tofire)
			n.fire();
	}
	
}
