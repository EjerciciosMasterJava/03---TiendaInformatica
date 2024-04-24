package com.sinensia.tienda.producto.telefono;

import com.sinensia.tienda.producto.ProductoImpl;

public class Telefono extends ProductoImpl{

	private Double descuento = 1.1;
	@Override
	public Double getPrecioConDescuento() {
		return getPrecio() * descuento;
	}


}
