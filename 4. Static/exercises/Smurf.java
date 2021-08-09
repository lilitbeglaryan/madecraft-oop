package exercises;

import org.junit.Test;

public class Smurf {

	private String name;
	private static boolean isTherePapa;
	private static boolean isThereDaughter;

	public static Smurf createSmurf(String name) {
		if((name.equalsIgnoreCase("papa") && isTherePapa) ||(name.equalsIgnoreCase("daughter")&& isThereDaughter))
			return null;
		System.out.println("Creating " + name + " Smurf");
		if (name.equalsIgnoreCase("papa")){isTherePapa=true;}
		else if (name.equalsIgnoreCase("daughter")){isThereDaughter=true;}
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	@Test

	public void tester(){
		Smurf sm1=Smurf.createSmurf("papa");
		Smurf sm2=Smurf.createSmurf("dada");
		Smurf sm3=Smurf.createSmurf("daughter");

	}

}
