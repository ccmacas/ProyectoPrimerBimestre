
package proyecto1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PruebaProyecto {
    // Creamos los arraylist de tipo de producto y de tipo personal
    public static ArrayList<Producto> catalogo = new ArrayList<Producto>();
    public static ArrayList<Personal> PersonalEmp = new ArrayList<Personal>();

    public static void main(String[] args) {
        
        //Creamos un objeto de la clase operaciones
        Operaciones opera = new Operaciones();
        //Creamos 3 pordutos 1 de tipo videojuegos y 2 de tipo Computadoras
        Producto compu1 = new Computadoras(4, "Windows 10", 1000, "HP", 3, "Laptop", 896.50, 4, true);
        Producto producto2 = new Computadoras(8, "Windows 10", 1000, "Dell", 7, "Super Dell", 1200.0, 4, true);
        Producto producto3 = new VideoJuegos("Accion", "Call of Duty", 7.89, 20, true);
        //Añadimos  productos al Arraylist
        catalogo.add(compu1);
        catalogo.add(producto2);
        catalogo.add(producto3);

        int op;
        //Usamos un ciclo do-while  para controlar la opcione que ingresa el usuario
        do {    

            op = Integer.parseInt(JOptionPane.showInputDialog("\n--------- Bienvenido al Sistema de Ventas ---------\n" 
                    + "Digite\n 1.Ingresar un nuevo Trabajador\n "
                    + "2.Mostar Productos Registrado\n 3.Realizar una Venta \n "
                    + "4.Mostrar valor en Caja\n 5.Mostrar Personal Registrado\n "
                    + "6.Registrar Cliente\n 7.Mostrar Clientes\n"
                    + "8.Mostar Salario Trabajadores"));
                    

            opera.menu(op, catalogo, PersonalEmp);
        } while (op != 0);//Hasta la opcion  sea diferente de 0
    }
    

}

