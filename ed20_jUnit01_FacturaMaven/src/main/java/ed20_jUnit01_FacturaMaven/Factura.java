package ed20_jUnit01_FacturaMaven;

import java.util.Vector;

public class Factura {

	Vector<Producto> productos = new Vector<Producto>();
	
	public void meterPoducto(Producto p) {	
		productos.add(p);
	}
	
	public float totalFactura() {
		float factura=0;
		for (int i=0; i<productos.size(); i++) {
			factura = factura + productos.elementAt(i).precioTotal();		
		}
		return factura;
		
	}
	
	public float aplicarIva(float iva) {
		return totalFactura()*(iva+1);
	}
}
