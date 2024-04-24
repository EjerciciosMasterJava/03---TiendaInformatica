package com.sinensia.tienda;

import java.util.ArrayList;
import java.util.List;

import com.sinensia.tienda.producto.ProductoImpl;

public class Tienda {
	
	private String nombreTienda;
	
	List<ProductoImpl> productos;
	
	public Tienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
		productos = new ArrayList<ProductoImpl>();
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public List<ProductoImpl> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoImpl> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Tienda [nombreTienda=" + nombreTienda + ", productos=" + productos + "]";
	}
	
}
