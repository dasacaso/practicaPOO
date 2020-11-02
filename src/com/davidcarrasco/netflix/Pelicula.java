package com.davidcarrasco.netflix;

public class Pelicula extends Video implements IVisualizable  {
	private int anio;	
	
	public Pelicula() {
		// TODO Auto-generated constructor stub
	}
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);		
	}
	public Pelicula(String titulo, String genero, String creador, int duracion, int anio) {
		super(titulo, genero, creador, duracion);
		this.anio = anio;
	}
	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String cadena = "Titulo: "+ this.getTitulo() + " Genero: "+ this.getGenero() + " Creador: "+ this.getCreador() + " Duracion Minutos: "+ this.getDuracion();
		return (cadena);
	}
	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		super.setVisto(true);
		
	}
	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int tiempoVisto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
