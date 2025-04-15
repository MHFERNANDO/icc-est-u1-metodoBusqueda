package controller;
import views.ShowConsole;
import controller.module.Persona;
public class MetodoBusqueda {
    private ShowConsole showConsole;
    private Persona[] people;
    public MetodoBusqueda(){}
    public MetodoBusqueda(Persona[] personas) {
        this.people = personas;
        ShowConsole show = new ShowConsole();
        show.codigo(); // Se obtiene el código a buscar desde la consola
        showPersonByCode(); // Se busca la persona por código
    }

    public int busquedaLineal(Persona[] arreglo, Persona busqueda){
        int posicion = -1; // Inicializamos la posicion como -1 para indicar que no se ha encontrado el elemento
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == busqueda) {
                System.out.println("El elemento " + busqueda + " se encuentra en la posicion " + i);
                posicion = i;
                break;
        } 
    }
    return posicion;
}

public int findPersonByCode (int code) {
    ShowConsole show = new ShowConsole();
    code = show.codigo(); // Se obtiene el código a buscar desde la consola
    for (int i = 0; i < people.length; i++) {
        if (people[i].getCode() == code) {
            System.out.println("El elemento " + code + " se encuentra en la posicion " + i);
            return i;
        }
    }
    return -1; // Si no se encuentra el código, se devuelve -1

}
public void showPersonByCode() {
    ShowConsole show = new ShowConsole();
    int codeToFind = show.codigo(); // Se obtiene el código a buscar desde la consola
    int indesPersona= findPersonByCode(codeToFind); // Se busca la persona por código
    if (indesPersona != -1) {
        System.out.println("Persona encontrada: " + people[indesPersona].toString());
    } else {
        System.out.println("Persona no encontrada.");
    }

}
}