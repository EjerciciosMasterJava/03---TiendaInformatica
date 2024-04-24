package com.sinensia.tienda.producto.ordenador;

import com.sinensia.tienda.producto.ProductoImpl;

public class Ordenador extends ProductoImpl{

	private Double descuento = 1.2;
	@Override
	public Double getPrecioConDescuento() {
		return getPrecio() * descuento;
	}

}
