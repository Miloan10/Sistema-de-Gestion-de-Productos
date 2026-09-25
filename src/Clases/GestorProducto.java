package Clases;

import java.util.ArrayList;
import java.util.List;

public class GestorProducto {

    private static Producto Producto;
    private static final List<Producto> listaProductos = new ArrayList<>();

    public void agregarProducto(int id, String nombre, double precio) {
        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                System.err.println("EL ID YA EXISTE");
                return;
            }
        }
        Producto = new Producto(id, nombre, precio);
        listaProductos.add(Producto);
    }

    public void mostrarProductos() {
        if (listaProductos.isEmpty()) {
            System.err.println("SIN PRODUCTOS");
        } else {
            for (Producto producto : listaProductos) {
                System.out.println(producto);
            }
        }
    }

    public void actualizarPrecioProducto(int id, double precio) {
        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                producto.setPrecio(precio);
                System.out.println("PRECIO ACTUALIZADO");
                return;
            }
        }
        System.err.println("EL PRODUCTO NO EXISTE");
    }

    public void eliminarProducto(int id) {

        for (Producto producto : listaProductos) {
            if (producto.getId() == id) {
                listaProductos.remove(producto);
                System.out.println("PRODUCTO ELIMINADO CORRECTAMENTE");
                return;
            }
        }

        System.err.println("EL PRODUCTO NO EXISTE");

    }
}
