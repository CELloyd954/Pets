public class Dog extends Pet {

	public Dog(String name) {
		super(name);
	}

	public String talk() {
		return isHappy() ? "WOOF!" : "woof";
	}

}