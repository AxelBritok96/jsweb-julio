package ar.com.educationit.buscador;

public class Buscador {

	//encapsulamiento
	protected String clave;

	public Buscador(String clave) {
		this.clave = clave;
	}
	
	public Articulo[] buscar() {

		System.out.println("Buscando " + this.clave);

		Libro l = new Libro("HARRY POTTER Y LAS RELIQU...", 1219f, "ROWLING, J. K.", false);
		Musica m = new Musica("LUIS MIGUEL LA SERIE",915.99f, "Varios");
		Pelicula p = new Pelicula("HARRY POTTER Y EL PRISION...",490.99f, "ROWLING, J. K");
		
		Articulo[]  articulos = {l,m,p};
		
		System.out.println("Se encontraron " + articulos.length + " resultados");
		
		return articulos;
	}
}
