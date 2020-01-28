public class TesterPet {
	public static void main(String[] args) {
		
		Dog dog = new Dog("Rex");
		Cat cat = new Cat("Zuri");
		Yorkie yorkie = new Yorkie("Frankie");
		Horse horse = new Horse("Yorktown");
		TalkingCat tcat = new TalkingCat("Sylvester");
		
		Pet[] pets = new Pet[5];
		pets[0] = dog;
		pets[1] = cat;
		pets[2] = yorkie;
		pets[3] = horse;
		pets[4] = tcat;
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
		tcat.feed();
		tcat.walk();
		tcat.speak();
		System.out.println(dog.talk());
		System.out.println(cat.talk());
		System.out.println(yorkie.talk());
		System.out.println(horse.talk());
		System.out.println(tcat.catTalking());
		

		System.out.println(po.getName() + " is " + po.talk());
	}
}