package hora;

public class DemoHora {

	
	public void demo() throws HoraExcepcion{
		try {
			Hora h = new Hora(69, 69, 69);
		} catch (HoraExcepcion e) {
			e.printStackTrace();
			throw new HoraExcepcion("Oye loco");
			
		}
		
	}
	
	
}
