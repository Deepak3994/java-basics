//Program to be run in command line
public class PlaneArray {
	String type;
	int weight;
	PlaneArray(String type, int weight) {
		this.type=type;
		this.weight=weight;
	}
	public String toString() {
		return type +"-"+weight;
	}
	public static void main(String a[]) {
		PlaneArray p[] = new PlaneArray[2];
		p[0] =  new PlaneArray(a[0],Integer.parseInt(a[1]));
		p[1] =  new PlaneArray(a[2],Integer.parseInt(a[3]));
		for(int i=0; i<p.length;i++) {
			//This will call toString() implicitly
			System.out.println(p[i]);
		}
		System.out.println("Plane type is:"+a[0]+" and weight is:"+a[1]);
		System.out.println("Plane type is:"+a[2]+" and weight is:"+a[3]);
	}

}
