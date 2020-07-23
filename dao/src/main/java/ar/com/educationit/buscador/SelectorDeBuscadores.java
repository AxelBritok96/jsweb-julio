package ar.com.educationit.buscador;

public class SelectorDeBuscadores {

	public static void main(String[] args) {
		
		// libro -> 1
		// musica -> 2
		Integer[] tiposBuscadores = {1,2};
		//f5/f6/f7/f8
		String claveBuscada = "Gladiador";

		Buscador[] buscadores = new Buscador[tiposBuscadores.length];
		
		for(int i = 0;i < tiposBuscadores.length; i++) {
			switch (tiposBuscadores[i]) {
				case 1:
					buscadores[i] = new BuscadorLibro(claveBuscada);
					break;
				case 2: 
					buscadores[i] = new BuscadorMusica(claveBuscada);
					break;
				case 3: 
					buscadores[i] = new BuscadorPelicula(claveBuscada);
					break;
				default:
					break;
			}
		}
		
		//ejecutar la busqueda y obtener los Articulos
		Articulo[] todosLosArticulos = new Articulo[5];
		int idxArticulo = 0;
		for(Buscador buscador : buscadores) {
			
			Articulo[] resultados = buscador.buscar();
			
			for(Articulo resulado : resultados) {
				todosLosArticulos[idxArticulo] = resulado;
				idxArticulo++;
			}
		}
		
		//muestro los resultados
		for (Articulo articulo : todosLosArticulos) {
			if(articulo != null) {
				System.out.println(articulo.getAutor());
				System.out.println(articulo.getTitulo());
				System.out.println(articulo.getPrecio());
			}
		}
		
		//up/down con objetos
		for(Buscador buscador : buscadores) {
			
			if(buscador instanceof BuscadorLibro) {
				//down casting
				
				((BuscadorLibro)buscador).getCantTotRes();
				
				BuscadorLibro bl = (BuscadorLibro)buscador;
				System.err.println(bl.getCantTotRes());
				
				//upcasting
				String claveEnPadre = ((Buscador)bl).clave;
			}
		}
	}

}
