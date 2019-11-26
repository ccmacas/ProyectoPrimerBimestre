
package proyecto1;

public class Producto {

	// Attributos
	private String nombre;
	private double precioUnitar;
	private int cantidStock;
	private boolean disponible = false;
	public static int dimensionArreglo;

	// Constructor vacio
	public Producto() {
	}
        //Constructor q recibe parametros
	public Producto(String nombre, double precioUnitar, int cantStock,
			boolean disponible) {
		this.nombre = nombre;
		this.precioUnitar = precioUnitar;
		this.cantidStock = cantStock;
		this.disponible = disponible;

		dimensionArreglo++;
	}

	//Metodos especiales  get and set
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitar() {
		return this.precioUnitar;
	}

	public void setPrecioUnitar(double precioUnitar) {
		this.precioUnitar = precioUnitar;
	}

	public int getCantidStock() {
		return this.cantidStock;
	}

	public void setCantidStock(int cantStock) {
		this.cantidStock = cantStock;
	}

	public boolean isDisponible() {
            //Usamos un if para ver si la cantidad disponible es mayor q cerp
		if (getCantidStock() > 0){
                    this.disponible = true; // le asignamos true
                }			
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
// Metodo toString
	@Override
	public String toString() {
		return "\nNombre: " + this.getNombre() + "\n" + "Precio unidad: "
				+ this.getPrecioUnitar() + " $ \n" + "En Stock: "
				+ this.getCantidStock();
	}

   
}
