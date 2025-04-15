package controller;

public class MetodoBusqueda {


    public int busquedaLineal(int[] arreglo, int busqueda){

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == busqueda) {
                System.out.println("El elemento " + busqueda + " se encuentra en la posicion " + i);
                int posicion = i;
                return posicion;

        }
        
    }return -1;
    
}}