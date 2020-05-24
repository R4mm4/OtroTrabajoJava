/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author shiro
 */
public class main {

    public static void main(String[] args) {
        Carrito obj = new Carrito();
        Productos p1 = new Productos("Papas", 15);
        Productos p2 = new Productos("Cocacola", 13);
        Productos p3 = new Productos("Sal de uvas", 3);
        Productos p4 = new Productos("Gansito", 10);
        Productos p5 = new Productos("Panda", 13);
        Productos p6 = new Productos("Panda", 13);

        obj.producto.add(p1);
        obj.producto.add(p2);
        obj.producto.add(p3);
        obj.producto.add(p4);
        obj.producto.add(p5);
        System.out.println("El total es: "+obj.tota());
        System.out.println("Descuento de producto: "+obj.descuento(11));
        Collection<Productos> re =  obj.precioMayor(10);
        for(Productos p : re){
            System.out.println("Producto: "+p.Nombre +" precio : "+p.precio);
        }
        //Productos distintos
        Collection<Productos> dis =  obj.distintos();
        for(Productos p : dis){
            System.out.println("Producto: "+p.Nombre +" precio : "+p.precio);
        }
    }

}
