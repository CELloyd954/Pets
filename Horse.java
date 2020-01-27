public class Horse extends Pet {

	public Horse(String name) {
		super(name);
	}

	public boolean isHappy() {
		return this.getFed() && this.getPetted() && this.getWalked() && this.getBrushed() && this.getRidden();
	}

	public String talk() {
		return isHappy() ? "Neigh :)" : "nay :(";
	}

}