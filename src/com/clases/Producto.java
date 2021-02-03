package com.clases;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Producto extends Clientes{
	
    private String nombre;
    private String carateristicas;
    private String idProducto;
    private String condiciones;
    public static List<Producto> nuevoProd = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarateristicas() {
        return carateristicas;
    }

    public void setCarateristicas(String carateristicas) {
        this.carateristicas = carateristicas;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
    
    public void ingresarProductos(ArrayList<Producto> listaProductos){

       	System.out.println("Ingrese el nombre del producto a crear"); 
		String cedula = in.nextLine();
        int sizeArray = 0;
        for(Clientes wClientes : arrclientes) {
            if(wClientes.getCedula().equals(cedula)) {
            	System.out.println("Ingresar el numero de productos a crear");
                sizeArray = in.nextInt();
                for (int i = 0; i < sizeArray; i++) {
                    Producto wProduct = new Producto();
                    nombre =JOptionPane.showInputDialog("Ingresar el nombre del producto");
                    carateristicas=JOptionPane.showInputDialog("Ingrese las caracterisricas del producto");
                    idProducto=JOptionPane.showInputDialog("Ingrese el id del producto");
                    condiciones=JOptionPane.showInputDialog("Ingresar la condición del producto");
            	
                    nuevoProd.add(wProduct);
                    wClientes.setProductos(nuevoProd);
                }
            }
        }
    }
}

