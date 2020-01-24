public class Cat extends Pet {


	public Cat(String name) {
		super(name);
	}

	public String isHappy() {
		return fed && !(walked || petted);
	}

	public String talk() {
		return isHappy() ? "meow" : "hssss";
	}

}