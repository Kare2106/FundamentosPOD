
public class CtaCte2 {
	void sumarContadorMain() {
		CuentaCorriente.contador += 100;
		sumarContadorMain();
	}
    static void sumarContadorMain1() {
    	CuentaCorriente.contador += 100;
    	CtaCte2 main = new CtaCte2();
		main.sumarContadorMain();
    }
	public static void main(String[] args) {
		
		CtaCte2 main = new CtaCte2();
		main.sumarContadorMain();
		
		CtaCte2.sumarContadorMain1();
		sumarContadorMain1();
	
		CuentaCorriente.sumarContador();
		System.out.println(CuentaCorriente.contador);
		
		CuentaCorriente cta = new CuentaCorriente();
		cta.saldo = 100;
		
		CuentaCorriente cta1 = new CuentaCorriente();
		cta1.saldo = 1000;

	}

	}

