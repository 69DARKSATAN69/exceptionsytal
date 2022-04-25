package hora;

public class HoraExcepcion extends Exception{

	
	private String texto;
	
	public HoraExcepcion(String texto) {
		this.texto = texto;
	}


	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MiExcepcion [texto=");
		builder.append(texto);
		builder.append("]");
		return builder.toString();
	}
	
	
}
