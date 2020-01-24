public class TesterPet {
	public static void main(String[] args) {
		
		Dog d = new Dog("Rex");
		Cat c = new Cat("Zuri");
		Yorkie y = new Yorkie("Frankie");
		Horse h = new Horse("Yorktown");
		
		Pet[] pets = new Pet[4];
		pets[0] = d;
		pets[1] = c;
		pets[2] = y;
		pets[3] = h;
		PetOwner po = new PetOwner(pets, "Cayden");

		// System.out.println("Dog says " + rex.isHappy());
		// System.out.println("Cat says " + zuri.isHappy());
		System.out.println(po.getName() + " is " + po.isHappy());

		System.out.println(d.talk());
		System.out.println(c.talk());
		System.out.println(y.talk());
		System.out.println(h.talk());

	}
}