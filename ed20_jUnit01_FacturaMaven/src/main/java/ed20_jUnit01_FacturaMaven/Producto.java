package ed20_jUnit01_FacturaMaven;

public class Producto extends Factura{
	
	String nombre;
	Float precio;
	int cantidad;
	
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio=precio;
		this.cantidad=cantidad;
	}
	
	public float precioTotal() {
		float total;
		total = precio * cantidad;
		return total;
	}
	
	public String toString() {
		String produc = "";
		produc +="\nPRODUCTO";
		produc +="\n========";
		produc +="\nNombre: "+nombre;
		produc +="\nPrecio: "+precio;
		produc +="\nCantidad: "+cantidad;
		return produc;
	}
	

}
