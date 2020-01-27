public class TesterPet {
	public static void main(String[] args) {
		
		Dog dog = new Dog("Rex");
		Cat cat = new Cat("Zuri");
		Yorkie yorkie = new Yorkie("Frankie");
		Horse horse = new Horse("Yorktown");
		
		Pet[] pets = new Pet[4];
		pets[0] = dog;
		pets[1] = cat;
		pets[2] = yorkie;
		pets[3] = horse;
		PetOwner po = new PetOwner(pets, "Cayden");

		dog.pet();
		dog.walk();
		dog.feed();
		cat.feed();
		for (int i = 0; i < 10; i++) {
			yorkie.pet();
		}
		horse.pet();
		horse.walk();
		horse.feed();
		horse.ride();
		horse.brush();
		System.out.println(dog.talk());
		System.out.println(cat.talk());
		System.out.println(yorkie.talk());
		System.out.println(horse.talk());
		

		System.out.println(po.getName() + " is " + po.talk());
	}
}