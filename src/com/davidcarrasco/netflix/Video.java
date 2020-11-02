package com.davidcarrasco.netflix;

public class Video {
	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	private boolean visto = false;
	
	public Video() {
		// TODO Auto-generated constructor stub
		this.visto = false;
	}
	
	public Video(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.visto = false;
	}
	
	public Video(String titulo, String genero, String creador, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.visto = false;
	}
		
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
}
