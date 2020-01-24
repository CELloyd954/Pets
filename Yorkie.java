public class Yorkie extends Pet {

	private timesPet = 0;

	public class Yorkie(String name) {
		super(name);
	}

	public int getTimes() {
		super.Pet();
		timesPet++;
	}

	public boolean isHappy() {
		if (timesPet < 10) {
			return false;
		} else {
			return true;
		}
	}

}