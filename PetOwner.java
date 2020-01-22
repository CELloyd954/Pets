public class PetOwner {

	private Dog dog;
	private Cat cat;

	public PetOwner(Dog dog, Cat cat) {
		this.dog = dog;
		this.cat = cat;
	}

	public String isHappy() {
		if (dog.isHappy().equals("WOOF!") && cat.isHappy().equals("meow")) {
			return "HAPPY";
		} else {
			return "NOT HAPPY";
		}
	}

}