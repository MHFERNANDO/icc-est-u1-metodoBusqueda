import controller.MetodoBusqueda;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoBusqueda busqueda = new MetodoBusqueda();
        int[] arreglo = {1, 2, 3, 4, 5};
        int numeroBuscado = 3;
        int resultado = busqueda.busquedaLineal(arreglo, numeroBuscado);
        System.out.println("El resultado de la busqueda es: " + resultado);}
    }

