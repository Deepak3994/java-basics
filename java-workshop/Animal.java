class Animal{
	char cname[];
	int height;
	void eat(){
		System.out.println("Eating");
	}
}

class Carnivore extends Animal{
	void hunt(){
		System.out.println("Hunt:");
		eat();
	}
}

class Herbivorous extends Animal{
	void graze(){
		System.out.println("is Grazing");
		eat();
	}
}

class Types{
	public static void main(String a[]){
		Carnivore c = new Carnivore();
		Herbivorous h = new Herbivorous();
		c.hunt(cow);
		h.graze();
	}
}