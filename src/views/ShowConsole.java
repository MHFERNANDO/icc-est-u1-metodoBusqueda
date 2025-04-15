package views;
import java.util.Scanner;

public class ShowConsole {

    public int codigo() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese codigo de la persona a buscar: ");
        int code = leer.nextInt();
        return code;
    }
}
