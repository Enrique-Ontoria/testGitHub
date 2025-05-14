package Clases;

public class Coche {
	//Propiedades de clase
	String marca;
	int potencia;
	
	//Constructor
	public Coche(String marca, int power){
		this.marca = marca;
		this.potencia = power;
	}
	
	//Meter marchas
	public boolean meterMarcha(int nMarcha) {
		
		if(nMarcha < 1 || nMarcha > 5) {
			System.out.print("esa marcha no esta diseñada en este coche.");
			return false;
		};
		
		return true;
	}
	
	//toString
	public String toString() {
		return "voy to loco xd";
	}
}
