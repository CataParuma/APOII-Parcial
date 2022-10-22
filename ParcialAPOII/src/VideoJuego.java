
public class VideoJuego implements Entregable {
	
	private String titulo, genero, compania;
	private int horasEstimadas, juegosEntregados;
	private boolean entregado, prestado;
	private VideoJuego[] listaV = new VideoJuego[5];
	
	public void lista() {
		
		listaV[0] = new VideoJuego("ZombiesXV", "Terror", "Terrores", 20);
		listaV[1] = new VideoJuego("Calabazas", "Infantil", "Infantes", 5);
		listaV[2] = new VideoJuego("Cocina", "Infantil", "Infantes", 15);
		listaV[3] = new VideoJuego("Sal y pimienta", "Romance", "Romanticos", 25);
		listaV[4] = new VideoJuego("Perritos", "Infantil", "Infantes", 10);
		
		listaV[0].entregar();
		listaV[2].entregar();
		listaV[4].entregar();
		
		for (int j = 0; j < listaV.length; j++) {
			
			System.out.println(listaV[j].toString());
			if(listaV[j].isEntregado()==true) {
				juegosEntregados++;
			}
		}
		
		System.out.println("Cantidad de juegos entregados: "+juegosEntregados+"\n");
	}

	public VideoJuego() {
		
		titulo = " ";
		genero = " ";
		compania = " ";
		horasEstimadas = 10;
		isEntregado();
	}
	
	public VideoJuego(String titulo, int horasEstimadas) {
		
		titulo = " ";
		genero = " ";
		compania = " ";
		horasEstimadas = 10;
		isEntregado();
	}
	
	public VideoJuego(String titulo, String genero, String compania, int horasEstimadas) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.compania = compania;
		this.horasEstimadas = horasEstimadas;
		isEntregado();
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

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String toString() {

		return "VideoJuego [titulo=" + titulo + ", genero=" + genero + ", compania=" + compania + ", horasEstimadas="
				+ horasEstimadas + "]";
	}

	public boolean entregar() {
		
		prestado=true;
		return prestado;
	}

	public boolean devolver() {
		
		prestado=false;
		return prestado;
	}

	public boolean isEntregado() {
		
		if(prestado==false) {
			return false;
		} else {
			return true;
		}
	}

	public void compareTo(Object a) {

		
	}
	
	
}

