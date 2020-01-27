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
		int count = 0;

		for (int i = 0; i < pets.length; i++) {
			
			if ((pets[i].isHappy())) {
				count++;
			} else {
				count = count;
			}

		}
		if (count == pets.length) {
			return true;
		} else {
			return false;
		}
	}

	public String talk() {
		return isHappy() ? "HAPPY" : "NOT HAPPY";
	}

}