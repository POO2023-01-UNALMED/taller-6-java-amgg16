package vehiculos;
import java.util.ArrayList;


public class Pais {
	private String nombre;
	private int cantventa;
	protected static ArrayList<Pais> listaPaises=new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		listaPaises.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getCantventa() {
		return cantventa;
	}
	
	public void setCantventa(int venta) {
		this.cantventa=venta;
	}
	
	public static Pais paisMasVendedor() {
		int ventamayor=-1;
		Pais paismayor=null;
		for (Pais pais:listaPaises) {
			final int cantventa= pais.cantventa;
			if (cantventa>ventamayor){
				ventamayor=cantventa;
				paismayor=pais;	
			}
		}
		
		return paismayor;
	} 
		
}
