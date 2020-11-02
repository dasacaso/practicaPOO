package com.davidcarrasco.netflix;

public class Serie extends Video implements IVisualizable {
	
	private int NoTemporadas;
	public Serie() {
		// TODO Auto-generated constructor stub
		this.NoTemporadas = 1;		
	}
	
	public Serie(String titulo, String creador) {
		super(titulo, creador);
		this.NoTemporadas = 1;
	}
	
	public Serie(String titulo, String genero, String creador, int duracion, int NoTemporadas) {
		super(titulo, genero, creador, duracion);
		this.NoTemporadas = NoTemporadas;
	}
	
	public int getNoTemporadas() {
		return NoTemporadas;
	}
	
	public void setNoTemporadas(int noTemporadas) {
		NoTemporadas = noTemporadas;
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
		super.setVisto( true);
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
