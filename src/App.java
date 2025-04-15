import controller.MetodoBusqueda;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoBusqueda busqueda = new MetodoBusqueda();
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] resultado = busqueda.busquedaLineal(arreglo);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
}
