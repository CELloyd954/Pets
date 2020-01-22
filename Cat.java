public class Cat {

	private boolean fed;
	private boolean walked;
	private boolean petted;

	public Cat(boolean fed, boolean walked, boolean petted) {
		this.fed = fed;
		this.walked = walked;
		this.petted = petted;
	}

	public void feed() {
		this.fed = true;
	}

	public void walk() {
		this.walked = true;
	}

	public void pet() {
		this.petted = true;
	}

	public boolean getFed() {
		return fed;
	}

	public boolean getWalked() {
		return walked;
	}

	public boolean getPetted() {
		return petted;
	}

	public String isHappy() {
		if (fed && !walked && !petted) {
			return "meow";
		} else {
			return "hssssss";
		}
	}

}