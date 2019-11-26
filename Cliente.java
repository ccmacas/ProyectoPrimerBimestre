	package proyecto1;
	 
	 
	public class Cliente extends Personal{
	    //Atributo de clase cliente
	    public String tipo;
	    //COnstructor que recibe parametros
	    public Cliente() {
	    }
	    // constructor recibe parametros
	    public Cliente(String tipo, String cedula, String nombre, String apellido, String telefono,            
	    String correo, String numCelular) {
	        super(cedula, nombre, apellido, telefono, correo, numCelular);
	        this.tipo = tipo;
	    }
	// metodos especiales set y get para obtener
	    public String getTipo() {
	        return tipo;
	    }
	 
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	    // Metdo toString que hereda de la clase padre
	    @Override
	    public String mostrarDatos(){
	        String ms=super.mostrarDatos();
	        return ms+tipo;
	    }
	}


