public class PetOwner {

	private String name;
	private Pet[] pets;

	public PetOwner(Pet[] pets, String name) {
		this.pets = pets;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isHappy() {
		
		boolean happy = true;

		for (int i = 0; i < pets.length; i++) {
			
			if (!(pets[i].isHappy())) {
				return false;
			} else {
				return true;
			}

		}
	}

}