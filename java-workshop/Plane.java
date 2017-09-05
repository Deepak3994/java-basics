class Plane{
	//int weight = 1000;
	int max = 7000;
	boolean isRunning = false;
	
	void start(int weight, int lagWeight){
		int totalWeight = weight + lagWeight;
		if(totalWeight > max){
			System.out.println("Overweight.");
		}
		else{
		System.out.println("Start called and weight is: "+totalWeight);
		isRunning = true;
		System.out.println("Plane is running");
}
	}
    
		void stop(){
		System.out.println("Stop called.");

	}

	public String toString(){
		return max+"-"+isRunning;
	}
}
class FSApp{
	public static void main(String a[]){
		Plane p1 = new Plane();
		System.out.println("Plane is not running");
		p1.start(1000,3000);
		p1.stop();
		
		System.out.println(p1);
	}
}
