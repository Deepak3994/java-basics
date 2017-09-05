class Dynamic{
	void takeoff(){
		System.out.println("Take off Dynamic");
	}
}

class Domestic extends Dynamic{
	//takeOff();

}

class Cargo extends Dynamic{
	//takeOff();

}

class Fighter extends Dynamic{
	//takeOff();
	void takeOff(){
		System.out.println("Take off fighter");
	}

}

class Vf extends Fighter{
	void launchMissile(){
		System.out.println("Take off VF");
	}
}

class DynamicPlane{
	public static void main(String a[]) {
		Dynamic p = null;
		//if(a[0].equals("D")){	
	//		p = new Domestic();
//		}
		if(a[0].equals("F")){
			p = new Vf();
		}
		if(p instanceof Vf){
		((Vf)p).launchMissile();
		 }
	}
}