package m3api.neural;

public class ResultNeuron extends Neuron {
	ResultLayer parentlayer;
	String desc;
	private boolean fired = false;
	
	public ResultNeuron(ResultLayer l, String desc) {
		parentlayer = l;
	}
	
	@Override
	public void fire() {
		fired = true;
	}

	public void reset() {
		fired = false;
	}
	
	public boolean isFired() {
		return fired;
	}
}
