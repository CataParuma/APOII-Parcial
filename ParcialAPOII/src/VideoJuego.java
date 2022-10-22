
public class VideoJuego implements Entregable {

	private String titulo, genero, compania;
	private int horasEstimadas, juegosEntregados;
	private boolean entregado;
	private VideoJuego[] listaV = new VideoJuego[5];

	public void lista() {

		listaV[0] = new VideoJuego("ZombiesXV", "Terror", "Terrores", 20);
		listaV[1] = new VideoJuego("Calabazas", "Infantil", "Infantes", 5);
		listaV[2] = new VideoJuego("Cocina", "Infantil", "Infantes", 15);
		listaV[3] = new VideoJuego("Sal y pimienta", "Romance", "Romanticos", 13);
		listaV[4] = new VideoJuego("Perritos", "Infantil", "Infantes", 10);

		listaV[0].entregar();
		listaV[2].entregar();
		listaV[4].entregar();

		for (int j = 0; j < listaV.length; j++) {

			System.out.println(listaV[j].toString());
			if (listaV[j].isEntregado() == true) {
				juegosEntregados++;
			}
		}

		System.out.println("Cantidad de juegos entregados: " + juegosEntregados);
		compareTo();
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

		return "VideoJuego [titulo=" + titulo + ", genero=" + genero + ", compañia=" + compania + ", horasEstimadas="
				+ horasEstimadas + " Estado de entrega: " + entregado + "]";
	}

	public boolean entregar() {

		entregado = true;
		return entregado;
	}

	public boolean devolver() {

		entregado = false;
		return entregado;
	}

	public boolean isEntregado() {

		if (entregado == false) {
			return false;
		} else {
			return true;
		}
	}

	public void compareTo() {

		int temp = 0;

		for (int i = 0; i < listaV.length; i++) {

			if (listaV[i].getHorasEstimadas() > listaV[temp].getHorasEstimadas()) {
				temp = i;
			}
		}

		System.out.println("El juego con mayor horas estimadas es: " + listaV[temp].toString());
	}
}
