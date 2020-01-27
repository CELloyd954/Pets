public class Cat extends Pet {

	public Cat(String name) {
		super(name);
	}

	public boolean isHappy() {
		return this.getFed() && !(this.getWalked() || this.getPetted());
	}

	public String talk() {
		return isHappy() ? "meow" : "hssss";
	}

}