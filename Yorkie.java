public class Yorkie extends Pet {

	private int timesPet = 0;

	public Yorkie(String name) {
		super(name);
	}

	public void pet() {
		super.pet();
		timesPet++;
	}

	public boolean isHappy() {
		if (timesPet < 10) {
			return false;
		} else {
			return true;
		}
	}

	public String talk() {
		return isHappy() ? "BARK!" : "Grrrr";
	}

}