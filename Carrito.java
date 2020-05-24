/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author shiro
 */
public class Carrito {

    ArrayList<Productos> producto = new ArrayList<Productos>();

    public double tota() {
        return producto.stream().mapToDouble(p -> p.precio).sum();
    }

    public double descuento(double preciob) {
        return producto.stream().mapToDouble(p -> p.precio).filter(pr -> pr >= preciob).map(pr -> pr * 0.5).sum();
    }
    public Collection<Productos> precioMayor(double precio){
        return producto.stream().filter(p->p.precio>precio).collect(Collectors.toList());
    }
    public Collection<Productos>distintos(){
        return producto.stream().distinct().collect(Collectors.toList());
    }
}
