public class TesterPet {
	public static void main(String[] args) {
		
		Dog rex = new Dog(true, true, true);
		Cat zuri = new Cat(true, false, true);
		PetOwner cayden = new PetOwner(rex, zuri);

		System.out.println("Dog says " + rex.isHappy());
		System.out.println("Cat says " + zuri.isHappy());
		System.out.println("Pet owner is " + cayden.isHappy());

	}
}