
public class MainTv {

	public static void main(String[] args) {
		Televisión tv1;
		tv1 = new Televisión();
		
		tv1.encender();
		System.out.println("Encendido: " + tv1.encendido);
		
		tv1.subirVolumen();
		tv1.subirVolumen();
		tv1.bajarVolumen();
		tv1.bajarVolumen();
		tv1.bajarVolumen();
		tv1.bajarVolumen();
		
		System.out.println("Volumen: " + tv1.volumen);
		
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		tv1.apagar();
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		
		System.out.println("Canal: " + tv1.canal);
		
		Televisión tv2 = new Televisión();
		tv2.encender();
		tv2.subirVolumen();
		tv2.subirVolumen();
		
		System.out.println("Volumen tv2: " + tv2.volumen);
		
	}

}
