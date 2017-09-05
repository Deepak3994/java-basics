class Constructor{
	int weight=1000;
	Constructor(){

	}
	Constructor(int weight){
		this.weight=weight;
		System.out.println("weight is:"+weight);
	}
}

class Fighter extends Constructor{
	Fighter(){

	}
	Fighter(int weight){
		super(weight);
	}
}

class Main{
	public static void main(String a[]){
		//Constructor c = new Constructor();
		//Constructor c = new Constructor(100);
		//Fighter f = new Fighter();
		Fighter f = new Fighter(3000);
	}
}