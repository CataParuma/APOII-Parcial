
public class Serie implements Entregable {

	private String titulo, genero, creador;
	private int numeroTemporadas, seriesEntregados;
	private boolean entregado;
	private Serie[] listaS = new Serie[5];

	public void lista() {

		listaS[0] = new Serie("Romances", "Romance", "David", 2);
		listaS[1] = new Serie("Dragones", "Terror", "Samantha", 3);
		listaS[2] = new Serie("Cocinando", "Familiar", "Romina", 5);
		listaS[3] = new Serie("Tarantulas", "Terror", "Samuel", 3);
		listaS[4] = new Serie("Naturaleza", "Infantil", "Sara", 7);

		listaS[1].entregar();
		listaS[3].entregar();

		for (int j = 0; j < listaS.length; j++) {

			System.out.println(listaS[j].toString());
			if (listaS[j].isEntregado() == true) {
				seriesEntregados++;
			}
		}

		System.out.println("Cantidad de series entregadas: " + seriesEntregados);

		compareTo();

	}

	public Serie() {

		titulo = " ";
		genero = " ";
		creador = " ";
		numeroTemporadas = 3;
		entregado = false;
	}

	public Serie(String titulo, String creador) {

		titulo = " ";
		genero = " ";
		creador = " ";
		numeroTemporadas = 3;
		isEntregado();
	}

	public Serie(String titulo, String genero, String creador, int numeroTemporadas) {

		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numeroTemporadas = numeroTemporadas;
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String toString() {

		return "Serie [titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", numeroTemporadas="
				+ numeroTemporadas + " Estado de entrega: " + entregado + "]";
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

		for (int i = 0; i < listaS.length; i++) {

			if (listaS[i].getNumeroTemporadas() > listaS[temp].getNumeroTemporadas()) {
				temp = i;
			}
		}

		System.out.println("La serie con mayor numero de temporadas es: " + listaS[temp].toString() + "\n");
	}
}
