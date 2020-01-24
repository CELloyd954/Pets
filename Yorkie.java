public class Yorkie extends Pet {

	private int timesPet = 0;

	public Yorkie(String name) {
		super(name);
	}

	public void pets() {
		super.pets();
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