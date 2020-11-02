package com.davidcarrasco.netflix;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula objPeliculas[] = new Pelicula[5];
		objPeliculas[0]= new Pelicula("Apollo 11","Historia/Documental","Todd Douglas Miller",102,2018);
		objPeliculas[1]= new Pelicula("Body Cam","Terror/Misterio/Suspenso","Malik Vitthal",96,2020);
		objPeliculas[2]= new Pelicula("Pets United","Animación/Aventura/Comedia","Reinhard Klooss",101,2019);
		objPeliculas[3]= new Pelicula("Sonic","Acción/Aventura/Comedia","Jeff Fowler",95,2018);
		objPeliculas[4]= new Pelicula("El Informante","Acción/Crimen/Drama","Malik Bader",112,2019);
		
		Serie objSeries[] = new Serie[5];
		objSeries[0] = new Serie("Stranger Things","Terror","Matt Duffer",45,5);
		objSeries[1] = new Serie("The Umbrella Academy","Acción","Steve Blackman",45,2);
		objSeries[2] = new Serie("La Casa de Papel","Crimen","Alvaro Morte",45,4);
		objSeries[3] = new Serie("You","Suspenso","Penn Badgley",20,2);
		objSeries[4] = new Serie("Sex Education","Drama","Emma Mackey",16,2);
		
		objPeliculas[2].marcarVisto();objPeliculas[4].marcarVisto();
		objSeries[1].marcarVisto();objSeries[3].marcarVisto();
		System.out.println("***LISTADO DE PELÍCULAS Y SERIES YA VISUALIZADAS***");
		
		for (int i=0;i<5;i++) {
			if (objPeliculas[i].isVisto()){
				System.out.println(objPeliculas[i].toString());
			}		
		}
		for (int i=0;i<5;i++) {
			if (objSeries[i].isVisto()){
				System.out.println(objSeries[i].toString());
			}		
		}
		
		System.out.println("***PELÍCULAS DEL AÑO MAS RECIENTE***");
		for (int i=0;i<5;i++) {
			if (objPeliculas[i].getAnio()==2020) {
				System.out.println(objPeliculas[i].toString());
			}					
		}
		
		Serie objSeries2 = new Serie();
		System.out.println("***SERIE CON MAS TEMPORADAS***");
		for (int i=0;i<5;i++) {
			
			if ((objSeries[i].getNoTemporadas()) > (objSeries2.getNoTemporadas())){
				objSeries2.setTitulo(objSeries[i].getTitulo()); 
				objSeries2.setCreador(objSeries[i].getCreador());
				objSeries2.setGenero(objSeries[i].getGenero());
				objSeries2.setNoTemporadas(objSeries[i].getNoTemporadas());
				objSeries2.setDuracion(objSeries[i].getDuracion());			
				
			}	
			if (i==4){
				System.out.println(objSeries2.toString());
			}
		}
		
		
	}

}
