package hora;

import java.io.IOException;

public class Hora {

	
	private int hora;
	private int minuto;
	private int segundo;
	
	
	
	public Hora(int h, int m, int s) throws HoraExcepcion{
		
		
		
		this.hora = h;
		this.minuto = m;
		this.segundo = s;


		
			
		}
	

	
	
	
	
	@Override	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hora [hora=");
		builder.append(hora);
		builder.append(", minuto=");
		builder.append(minuto);
		builder.append(", segundo=");
		builder.append(segundo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
