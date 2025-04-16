package controller;
import controller.module.Persona;
import views.ShowConsole;
public class MetodoByte {

    private Persona[] personas;
    private ShowConsole pantalla;
    public MetodoByte(Persona[] personasl) {
        this.personas = personasl;
        this.pantalla = new ShowConsole();
        pantalla.MostrarMensaje("Ingrese el código de la persona a buscar:");
    }
    //public int busquedaBinaria (Persona[] arreglo) {
    //}  
    public int findPersonByCode (int code){
        int bajo= 0;
        int alto = personas.length - 1; 
        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            if (personas[medio].getCode() == code) {
                return medio; // Código encontrado
            } else if (personas[medio].getCode() < code) {
                bajo = medio + 1; // Buscar en la mitad superior
            } else {
                alto = medio - 1; // Buscar en la mitad inferior
            }
        }return -1; // Código no encontrado
    }
    public int findPersonByName (String name) {
         // Nombre no encontrado
    }
    public void showPersonByCode() {
        int codeToFind = pantalla.codigo();
        int index = findPersonByCode(codeToFind);
        if (index != -1) {
            pantalla.MostrarMensaje("Persona encontrada: " + personas[index].toString());
        } else {
            pantalla.MostrarMensaje("Persona no encontrada.");
        }
    }
}
