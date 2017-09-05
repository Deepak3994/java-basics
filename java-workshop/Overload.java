class Overload{
	void draw(int radius,int outerThickness){
		System.out.println("Drawing..circle with radius:"+radius+" and thickness:"+outerThickness);
	}
	void draw(int radius){
		System.out.println("Drawing..circle with radius:"+radius);
	}	
}

class Draw{
	public static void main(String a[]){
	Overload c = new Overload();
	c.draw(10,5);
	c.draw(15);
  }
}