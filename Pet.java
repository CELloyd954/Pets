public class Pet {

	private String name;
	
	private boolean fed;
	private boolean walked;
	private boolean petted;
	private boolean brushed;
	private boolean ridden;

	public Pet(String name) {
		this.name = name;
	}

	public void brush() {
		this.brushed = true;
	}

	public void ride() {
		this.ridden = true;
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

	public boolean getBrushed() {
		return brushed;
	}

	public boolean getRidden() {
		return ridden;
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

	public boolean isHappy() {
		return fed && walked && petted;
	}

}