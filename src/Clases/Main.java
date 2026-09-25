package Clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorProducto gestor = new GestorProducto();

        int op = 0;

        do {
            System.out.println("\nMENU DE GESTION DE PRODUCTOS");
            System.out.println("1. Crear producto"
                    + "\n2. Mostrar productos"
                    + "\n3. Actualizar precio"
                    + "\n4. Eliminar producto"
                    + "\n5. Salir");

            System.out.println("");
            System.out.print("Elige una opcion: ");
            op = sc.nextInt();

            if (op == 1) {

                System.out.print("Ingrese el ID: ");
                int id = sc.nextInt();

                System.out.print("Ingrese el nombre: ");
                String nombre = sc.next();

                System.out.print("Ingrese el precio: ");
                double precio = sc.nextDouble();

                gestor.agregarProducto(id, nombre, precio);

            } else if (op == 2) {

                gestor.mostrarProductos();

            } else if (op == 3) {

                System.out.print("Ingrese el ID del producto: ");
                int id = sc.nextInt();

                System.out.print("Ingrese el nuevo precio: ");
                double precio = sc.nextDouble();

                gestor.actualizarPrecioProducto(id, precio);

            } else if (op == 4) {

                System.out.print("Ingrese el ID del producto: ");
                int id = sc.nextInt();

                gestor.eliminarProducto(id);

            }

        } while (op != 5);

        sc.close();
    }
}