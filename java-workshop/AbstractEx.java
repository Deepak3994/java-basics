abstract class AbstarctEx {

}

abstract class Flying extends AbstarctEx{
	abstract public void fly();

}

abstract class NonFlying extends AbstarctEx{

}
abstract class Crow extends Flying{

}

abstract class Eagle extends Flying{
	abstract public void hunt();
	public void fly(){
		System.out.println("Flying..");
	}

}

abstract class peahen extends NonFlying{

}
abstract class Chick extends NonFlying{

}
class Bald extends Eagle{
	public void hunt(){
		System.out.println("Bald Eagle..");
	}

}
class Serpant extends Eagle{
	public void hunt(){
		System.out.println("Serpant Eagle..");
	}

}
class Mountain extends Eagle{
	public void hunt(){
		System.out.println("Mountain Eagle..");
	}

}

class Birds{
	public static void main(String a[]){
		Eagle e = null;
		if(a[0].equals("B")){
			e = new Bald();
		}
		if(a[0].equals("M")){
			e = new Mountain();
		}
		e.fly();
		e.hunt();
	}
}