package Clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("MENU DE GESTION DE PRODUCTOS");
            System.out.println("1. Crear producto"
                    + "\n2. Mostrar productos"
                    + "\n3. Actualizar precio"
                    + "\n4. Eliminar producto"
                    + "\n5. Salir");
            System.out.println("");
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();

            if (op == 1) {

            } else if (op == 2) {

            } else if (op == 3) {

            } else if (op == 4) {

            }
        } while (op == 5);
    }
}
