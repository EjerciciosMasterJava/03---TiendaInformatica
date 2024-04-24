package com.sinensia.tienda.producto;

public abstract class ProductoImpl implements Producto{
	
	private Long id;
	private Integer precio;
	private String nombre;
	private Long stock;
	private ProductoEnum modelo;
	
	public ProductoImpl() {
		super();
	};
	
	public ProductoImpl(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public abstract Double getPrecioConDescuento();

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", nombre=" + nombre + "]";
	}
}
