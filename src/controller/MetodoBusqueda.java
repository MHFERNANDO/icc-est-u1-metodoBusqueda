package controller;

public class MetodoBusqueda {


    public int[] busquedaLineal(int[] arreglo){
        int[] resultado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[i];
        }
        return resultado;
    }
    
}