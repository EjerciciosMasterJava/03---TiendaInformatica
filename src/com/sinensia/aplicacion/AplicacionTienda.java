package com.sinensia.aplicacion;

import java.util.Arrays;

import com.sinensia.tienda.Tienda;
import com.sinensia.tienda.producto.Producto;
import com.sinensia.tienda.producto.ProductoImpl;
import com.sinensia.tienda.producto.ordenador.Ordenador;
import com.sinensia.tienda.producto.telefono.Telefono;

public class AplicacionTienda {
	public static void main(String[] args) {
		Tienda tienda = new Tienda("tienda");
		tienda.setProductos(
				Arrays.asList(
						new ProductoImpl[] {
								new Ordenador(),
								new Telefono()
						}
						)
				
				);
		tienda.getProductos().forEach(System.out::println);
	}
}
