package m3api.neural;

import java.util.ArrayList;

public class InputNeuron extends Neuron {
	public final ArrayList<Neuron> tofire = new ArrayList<>();
	InputLayer parentlayer;
	String desc;
	private boolean fired = false;
	
	public InputNeuron(InputLayer l, String desc) {
		parentlayer = l;
	}
	
	public boolean isFired() {
		return fired;
	}
	
	public void setFired(boolean fire) {
		this.fired = fire;
	}
}
