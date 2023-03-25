package vehiculos;
import java.util.ArrayList;


public class Fabricante {
	private String nombre;
	private Pais pais;
    private int cantventa;
	protected static ArrayList<Fabricante> listaFabricantes=new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		listaFabricantes.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	
	public int getCantventa() {
		return cantventa;
	}
	
	public void setCantventa(int venta) {
		this.cantventa=venta;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int ventamayor=-1;
		Fabricante fabricantemayor=null;
		for (Fabricante fabricante:listaFabricantes) {
			final int cantventa= fabricante.cantventa;
			if (cantventa>ventamayor){
				ventamayor=cantventa;
				fabricantemayor=fabricante;	
			}
		}
		
		return fabricantemayor;
	}

}
