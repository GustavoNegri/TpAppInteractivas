package negocio.reclamos;

import negocio.Producto;

public class ItemProductoReclamo {

	private Producto producto;
	private int cantidad;

	public ItemProductoReclamo(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}
}
