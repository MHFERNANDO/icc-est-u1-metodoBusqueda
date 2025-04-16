import controller.MetodoBusqueda;
import controller.MetodoByte;
import controller.module.Persona;
import views.ShowConsole;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofia");
        personas[6] = new Persona(107, "Pedro");
        /*Persona numeroBuscado = new Persona(104, "Ana");
        int resultado = busqueda.busquedaLineal(personas, numeroBuscado);
        System.out.println("El resultado de la busqueda es: " + resultado);}*/
        MetodoByte metodoByte = new MetodoByte(personas);
        //System.out.println("Ingrese el codigo a buscar: ");
        //int codigo = leer.nextInt();
        //metodoByte.findPersonByCode(codigo);
        metodoByte.showPersonByCode();
        


    }
}

