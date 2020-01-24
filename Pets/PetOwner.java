public class PetOwner {

	private String name;
	private Pet[] pets;

	public PetOwner(Pet[] pets, Sring name) {
		this.pets = pets;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public booleaan isHappy() {
		
		boolean happy = true;

		for (int i = 0; i < pets.length; i++) {
			
			if !(dog.isHappy() || cat.isHappy()) happy = false;

		}
	}

}