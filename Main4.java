
public class Main4 {
	
	public static void subirVolumen(int volumen) {
		volumen = volumen + 10;
	}
	public static void subirVolumen(Televisión tv) {
		tv.subirVolumen();
	}

	public static void main(String[] args) {
		// variables por valor o primitivas int float double char 
		// variables por referencia u objeto
		int volumen = 100;
		Televisión tv1 = new Televisión();
		tv1.encender();
		tv1.subirVolumen();
		tv1.subirVolumen();
		
		subirVolumen(volumen);
		subirVolumen(tv1);
		
		System.out.println(volumen);
		System.out.println(tv1.volumen);

	}

}
