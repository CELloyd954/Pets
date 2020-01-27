public class Horse extends Pet {

	private boolean brushed;
	private boolean ridden;

	public Horse(String name) {
		super(name);
	}

	public void brush() {
		this.brushed = true;
	}

	public void ride() {
		this.ridden = true;
	}

	public boolean getBrushed() {
		return brushed;
	}

	public boolean getRidden() {
		return ridden;
	}

	public boolean isHappy() {
		return this.getFed() && this.getPetted() && this.getWalked() && brushed && ridden;
	}

	public String talk() {
		return isHappy() ? "Neigh :)" : "nay :(";
	}

}